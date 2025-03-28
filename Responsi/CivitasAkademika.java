/*  Nama File   : Dosen.java
    Nama        : Gherald Abraham
    NIM         : 24060123140210
    Tanggal     : 28 - Maret - 2025
*/

class CivitasAkademika {
    protected String nama;
    protected String email;
    private static int jumlahMahasiswa = 0;
    private static int jumlahDosen = 0;
    private static int jumlahTendik = 0;
    
    public CivitasAkademika(String nama, String email) {
        this.nama = nama;
        this.email = email;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama                    : " + nama);
        System.out.println("Email                   : " + email);
    }
    
    public static void tambahMahasiswa() {
        jumlahMahasiswa++;
    }
    
    public static void tambahDosen() {
        jumlahDosen++;
    }
    
    public static void tambahTendik() {
        jumlahTendik++;
    }
    
    public static void tampilkanJumlahCivitas() {
        System.out.println("Jumlah Mahasiswa        : " + jumlahMahasiswa);
        System.out.println("Jumlah Dosen            : " + jumlahDosen);
        System.out.println("Jumlah Tendik           : " + jumlahTendik);
    }
}