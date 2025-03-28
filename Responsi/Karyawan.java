/*  Nama File   : Dosen.java
    Nama        : Gherald Abraham
    NIM         : 24060123140210
    Tanggal     : 28 - Maret - 2025
*/

class Karyawan extends CivitasAkademika {
    protected String NIP;
    protected int masaKerja;
    
    public Karyawan(String nama, String email, String NIP, int masaKerja) {
        super(nama, email);
        this.NIP = NIP;
        this.masaKerja = masaKerja;
    }
    
    public double hitungGaji() {
        return 0;
    }
    
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("NIP                     : " + NIP);
        System.out.println("Masa Kerja              : " + masaKerja + " tahun");
    }
}