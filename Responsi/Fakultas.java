/*  Nama File   : Dosen.java
    Nama        : Gherald Abraham
    NIM         : 24060123140210
    Tanggal     : 28 - Maret - 2025
*/

public class Fakultas {
    private String nama;
    private double tarifUKT;
    private double gajiPokok;
    
    public Fakultas() {
        this.nama = "";
        this.tarifUKT = 0;
        this.gajiPokok = 0;
    }
    
    public Fakultas(String nama, double tarifUKT, double gajiPokok) {
        this.nama = nama;
        this.tarifUKT = tarifUKT;
        this.gajiPokok = gajiPokok;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public double getTarifUKT() {
        return tarifUKT;
    }
    
    public void setTarifUKT(double tarifUKT) {
        this.tarifUKT = tarifUKT;
    }
    
    public double getGajiPokok() {
        return gajiPokok;
    }
    
    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    
    public void tampilkanInfo() {
        System.out.println("Fakultas                : " + nama);
        System.out.println("Tarif UKT               : Rp" + tarifUKT);
        System.out.println("Gaji Pokok              : Rp" + gajiPokok);
    }
}
