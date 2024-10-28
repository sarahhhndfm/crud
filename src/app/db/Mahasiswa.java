
package app.db;
/**
*
* @author Sarah
*/
public class Mahasiswa {

    public static int size() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String NoBP;
    private String Nama;
    private String TempatLahir;
    private String TanggalLahir;
    private String Alamat;
    private String Telp;
    private String AsalSekolah;

    public Mahasiswa(){
    }
    
    public static void add(Mahasiswa mhs) {
    }
    
    public String getAsalSekolah(){
        return AsalSekolah;
    }
    public void setAsalSekolah (String AsalSekolah){this.AsalSekolah = AsalSekolah; }
    
    public String getTelp(){return Telp; }
    public void setTelp (String Telp){this.Telp = Telp; }
    public String getAlamat(){
    return Alamat;
    }
    public void setAlamat (String Alamat){
    this.Alamat = Alamat;
    }
    public String getTanggalLahir(){
    return TanggalLahir;
    }
    public void setTanggalLahir (String TanggalLahir){
    this.TanggalLahir = TanggalLahir;
    }
    public String getTempatLahir(){
    return TempatLahir;
    }
    public void setTempatLahir (String TempatLahir){
    this.TempatLahir = TempatLahir;
    }
    public String getNama(){
    return Nama;
    }
    public void setNama (String Nama){
    this.Nama = Nama;
    }
    public String getNoBP(){
    return NoBP;
    }
    public void setNoBP (String NoBP){
    this.NoBP = NoBP;
    }

    void getNama(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void getTempatLahir(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void getTanggalLahir(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void getAlamat(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void getTelp(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void getAsalSekolah(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}