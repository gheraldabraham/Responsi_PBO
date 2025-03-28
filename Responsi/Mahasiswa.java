/*  Nama File   : Dosen.java
    Nama        : Gherald Abraham
    NIM         : 24060123140210
    Tanggal     : 28 - Maret - 2025
*/

class Mahasiswa extends CivitasAkademika {
    private String NIM;
    private int semester;
    private Fakultas fakultas;
    
    public Mahasiswa(String nama, String email, String NIM, int semester, Fakultas fakultas) {
        super(nama, email);
        this.NIM = NIM;
        this.semester = semester;
        this.fakultas = fakultas;
        tambahMahasiswa();
    }
    
    public double hitungUKT() {
        return fakultas.getTarifUKT() * Math.pow(0.95, semester - 1);
    }
    
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("NIM                     : " + NIM);
        System.out.println("Semester                : " + semester);
        System.out.println("Fakultas                : " + fakultas.getNama());
        System.out.printf("Biaya UKT               : Rp %.0f\n", hitungUKT());
    }
}