public class Main {
    public static void main(String[] args) {

        // Instansiasi langsung dari masing-masing konkret class
        Mahasiswa mahasiswa = new Mahasiswa("Dybala", 20, true, "12345678", 3.5, 2);
        mahasiswa.ngerjainTugas();
        mahasiswa.pasrah();
        mahasiswa.mengikutiOrganisasi("BEM");

        Resepsionis resepsionis = new Resepsionis("Diva", 24, false, 101, "Front Desk", 3000);
        resepsionis.melayani();
        resepsionis.melapor();
        resepsionis.presentasi();

        Asprak asprak = new Asprak("Regita", 22, false, "65124879", 3.9, 1);
        asprak.ngasihKomenDIGCR();
        asprak.mengajar("Pemrograman Dasar");
        asprak.mengasihTugas();
        asprak.menilaiTugas();

        Dosen dosen = new Dosen("Pak Santo", 45, true, "123456789", 6000000);
        dosen.ikutPenelitian();
        dosen.mengajar("Matematika Komputasi");
        dosen.mengasihTugas();
        dosen.menilaiTugas();

        // Instansiasi dengan upcasting
        Civitas mahasiswaUpcast = new Mahasiswa("Imel", 21, false, "11223344", 3.7, 3);
        mahasiswaUpcast.makanDiKantin("Kantin Timur");
        mahasiswaUpcast.mainGameComer();
        mahasiswaUpcast.naikLift();

        Civitas resepsionisUpcast = new Resepsionis("Nanang", 30, true, 102, "Back Office", 3500);
        resepsionisUpcast.makanDiKantin("Kantin Barat");
        resepsionisUpcast.mainGameComer();
        resepsionisUpcast.naikLift();

        Pengajar asprakUpcast = new Asprak("Ahmad", 23, true, "99887766", 3.9, 1);
        asprakUpcast.mengajar("PBO");
        asprakUpcast.mengasihTugas();
        asprakUpcast.menilaiTugas();

        Pengajar dosenUpcast = new Dosen("Ibu Uun", 33, false, "987654321", 7500000);
        dosenUpcast.mengajar("Statistika");
        dosenUpcast.mengasihTugas();
        dosenUpcast.menilaiTugas();
    }
}
