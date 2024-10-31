
package app.db;

public class Mahasiswa {


    private String NoBP;
    private String Nama;
    private String TempatLahir;
    private String TanggalLahir;
    private String Alamat;
    private String Telp;
    private String AsalSekolah;

    public Mahasiswa(){
    }
    
    public Mahasiswa(String NoBP, String Nama, String TempatLahir, String TanggalLahir, String Alamat, String Telp, String AsalSekolah) {
        this.NoBP = NoBP;
        this.Nama = Nama;
        this.TempatLahir = TempatLahir;
        this.TanggalLahir = TanggalLahir;
        this.Alamat = Alamat;
        this.Telp = Telp;
        this.AsalSekolah = AsalSekolah;
    }
    
    public String getAsalSekolah(){
        return AsalSekolah;
    }
    public void setAsalSekolah (String AsalSekolah){
        this.AsalSekolah = AsalSekolah; 
    }
    
    public String getTelp(){
        return Telp; 
    }
    public void setTelp (String Telp){
        this.Telp = Telp; 
    }
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
}