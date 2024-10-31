
package app.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MahasiswaManager {

    Connection conn = null;
    Statement st = null;

    String driver = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/db_si_53";
   
    public MahasiswaManager(){
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, "root", "");
            st = conn.createStatement();
            System.out.println("Database connection established.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public List<Mahasiswa> getMahasiswa(){
        ResultSet resultSet = null;
        List Mahasiswa = new ArrayList<>();

        try {
            resultSet = st.executeQuery("Select * From tbl_mahasiswaa");
            while (resultSet.next()) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNoBP(resultSet.getString("NoBP"));
                mhs.setNama(resultSet.getString("Nama"));
                mhs.setTempatLahir(resultSet.getString("TempatLahir"));
                mhs.setTanggalLahir(resultSet.getString("TanggalLahir"));
                mhs.setAlamat(resultSet.getString("Alamat"));
                mhs.setTelp(resultSet.getString("Telp"));
                mhs.setAsalSekolah(resultSet.getString("AsalSekolah"));
                Mahasiswa.add(mhs);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Mahasiswa;
    }
    public int Insert(Mahasiswa mhs){
        int result = 0;
        try {
            result = st.executeUpdate("insert into tbl_mahasiswaa value('"+ mhs.getNoBP() +"'  ,'"+ mhs.getNama() +"'  ,'"+ mhs.getTempatLahir() + "','" + mhs.getTanggalLahir() + "','" + mhs.getAlamat() + "','" + mhs.getTelp() + "','" + mhs.getAsalSekolah() + "')"); 
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
   public int Delete(Mahasiswa mhs){
        int result = 0;
        try {
            result = st.executeUpdate("delete from tbl_mahasiswaa where NoBP ='"+ mhs.getNoBP() +"'  ");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
   public int Update(Mahasiswa mhs){
        int result = 0;
        try {
            result = st.executeUpdate("update tbl_mahasiswaa set NoBP = " + mhs.getNoBP() + "',Nama='" + mhs.getNama() + "',TempatLahir='"+ mhs.getTempatLahir() + "',TanggalLahir='" + mhs.getTanggalLahir() + "',Alamat='" + mhs.getAlamat() + "',Telp='" + mhs.getTelp() + "',AsalSekolah='" + mhs.getAsalSekolah() + "'where NoBP ='" + mhs.getNoBP() +"'");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
   public void closeConnection(){
        try {
            st.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}       