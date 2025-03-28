/*  Nama File   : Dosen.java
    Nama        : Gherald Abraham
    NIM         : 24060123140210
    Tanggal     : 28 - Maret - 2025
*/

class Dosen extends Karyawan {
    private Fakultas fakultas;
    
    public Dosen(String nama, String email, String NIP, int masaKerja, Fakultas fakultas) {
        super(nama, email, NIP, masaKerja);
        this.fakultas = fakultas;
        tambahDosen();
    }
    
    @Override
    public double hitungGaji() {
        return fakultas.getGajiPokok() + (masaKerja * 0.01 * fakultas.getGajiPokok());
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Fakultas                : " + fakultas.getNama());
        System.out.printf("Gaji                    : Rp %.0f\n", hitungGaji());
    }
}
