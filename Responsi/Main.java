public class Main {
    public static void main(String[] args) {
        Fakultas fakultasTeknik = new Fakultas("Teknik", 85000000, 7000000);
        
        Mahasiswa mhs1 = new Mahasiswa("Budi Siregar", "budisiregar@gmail.com", "24060123199999", 5, fakultasTeknik);
        mhs1.tampilkanInfo();
        System.out.println();
        
        Dosen dosen1 = new Dosen("Dr. Bambang Susanto", "bambang@gmail.com", "197306101998021001", 8, fakultasTeknik);
        dosen1.tampilkanInfo();
        System.out.println();
        
        Tendik tendik1 = new Tendik("Rosyidah", "rosyidah@example.com", "199208102024081991", 7);
        tendik1.tampilkanInfo();
        System.out.println();
        
        CivitasAkademika.tampilkanJumlahCivitas();
    }
}
