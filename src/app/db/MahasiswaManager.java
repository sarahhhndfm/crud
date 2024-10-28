
package app.db;

import java.security.spec.ECField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MahasiswaManager {

    public static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    Connection conn = null;
    Statement st = null;

    String driver = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/db_si_53";
   
    public MahasiswaManager(){
        try {
          Class.forName(driver);
          conn = DriverManager.getConnection(url, "root", "");
             st = conn.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public List getMahasiswa(){
        ResultSet resultSet = null;
        List mahasiswa = new ArrayList<>();

        try {
            resultSet = st.executeQuery("Select * From tbl_mahasiswaa");
            while (resultSet.next()) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNoBP(resultSet.getString("NoBP"));
                mhs.getNama(resultSet.getString("Nama"));
                mhs.getTempatLahir(resultSet.getString("TempatLahir"));
                mhs.getTanggalLahir(resultSet.getString("TanggalLahir"));
                mhs.getAlamat(resultSet.getString("Alamat"));
                mhs.getTelp(resultSet.getString("Telp"));
                mhs.getAsalSekolah(resultSet.getString("AsalSekolah"));
                Mahasiswa.add(mhs);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mahasiswa;
    }
    public int Insert(Mahasiswa m){
        int result = 0;
        try {
            result = st.executeUpdate("insert into tbl_mahasiswaa value ('"+ m.getNoBP() +"','"+ m.getNama() +"','"+ m.getTempatLahir() +"','"+ m.getAlamat() +"','"+ m.getTelp() +"','"+ m.getAsalSekolah() +"')");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
   }
   public int Delete(Mahasiswa m){
        int result = 0;
        try {
            result = st.executeUpdate("delete from tbl_mahasiswaa where NoBP = '"+ m.getNoBP() +"'");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return result;
   }
   public int Update(Mahasiswa m){
        int result = 0;
        try {
            result = st.executeUpdate("update tbl_mahasiswaa set NoBP ='"+ m.getNoBP() +"', Nama ='"+ m.getNama() +"', TempatLahir='"+ m.getTempatLahir() +"', TanggalLahir='"+ m.getTanggalLahir() +"', Alamat='"+ m.getAlamat() +"', Telp ='"+ m.getTelp() +"', AsalSekolah='"+ m.getAsalSekolah() +"', where NoBP='"+ m.getNoBP() +"'");
        } catch (Exception e) {
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