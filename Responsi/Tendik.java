/*  Nama File   : Dosen.java
    Nama        : Gherald Abraham
    NIM         : 24060123140210
    Tanggal     : 28 - Maret - 2025
*/

class Tendik extends Karyawan {
    private static final double GAJI_POKOK = 4000000;
    
    public Tendik(String nama, String email, String NIP, int masaKerja) {
        super(nama, email, NIP, masaKerja);
        tambahTendik();
    }
    
    @Override
    public double hitungGaji() {
        return GAJI_POKOK + (masaKerja * 0.01 * GAJI_POKOK);
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.printf("Gaji                    : Rp %.0f\n", hitungGaji());
    }
}
