public class Main {
    public static void main(String[] args) {
        // Testcase Manusia
        System.out.println("Testcase Manusia:");
        // a. Laki-laki telah menikah
        Manusia priaMenikah = new Manusia("Rahmad", true, "5468982345", true);
        System.out.println(priaMenikah.toString());

        // b. Perempuan telah menikah
        Manusia wanitaMenikah = new Manusia("Amel", false, "0867656321", true);
        System.out.println(wanitaMenikah.toString());

        // c. Belum menikah
        Manusia belumMenikah = new Manusia("Alvin", true, "2354176590", false);
        System.out.println(belumMenikah.toString());

        // Tescase MahasiswaFILKOM    
        //a. Mahasiswa FILKOM IPK < 3
        MahasiswaFILKOM mahasiswa1 = new MahasiswaFILKOM("Deni", true, "5678093478" , true, "6709713479", 2.3);
        System.out.println("1. Mahasiswa FILKOM IPK < 3:");
        System.out.println(mahasiswa1.toString());
        
        //b. Mahasiswa FILKOM IPK 3 - 3.5
        MahasiswaFILKOM mahasiswa2 = new MahasiswaFILKOM("Ghea", false, "1225678059", false, "1345780924", 3.3);
        System.out.println("\n2. Mahasiswa FILKOM IPK 3 - 3.5");
        System.out.println(mahasiswa2.toString());
        
        //c. Mahasiswa FILKOM IPK 3.5 - 4
        MahasiswaFILKOM mahasiswa3 = new MahasiswaFILKOM("Najwa", false, "3468297463", false, "1279476392", 3.9);
        System.out.println("\n3. Mahasiswa FILKOM IPK 3.5 - 4");
        System.out.println(mahasiswa3.toString());
        
        // Testcase Pekerja
        System.out.println("\nTestcase Pekerja:");
        // a. Lama bekerja 2 tahun, anak 2
        Pekerja pekerja1 = new Pekerja("Mahalini", false, "123456789", true, 5000, LocalDate.now().minusYears(2));
        pekerja1.setJumlahAnak(2);
        System.out.println(pekerja1.toString());

        // b. Lama bekerja 9 tahun
        Pekerja pekerja2 = new Pekerja("Rony", true, "987654321", true, 6000, LocalDate.now().minusYears(9));
        System.out.println(pekerja2.toString());

        // c. Lama bekerja 20 tahun, anak 10
        Pekerja pekerja3 = new Pekerja("Tiara", false, "135792468", true, 8000, LocalDate.now().minusYears(20));
        pekerja3.setJumlahAnak(10);
        System.out.println(pekerja3.toString());
        
        // Testcase Manager
        System.out.println("\nTestcase Manager:");
        // Manager, lama bekerja 15 tahun dengan gaji $7500
        Manager manager = new Manager("Nanda", true, "246813579", true, 7500, LocalDate.now().minusYears(15), "IT");
        System.out.println(manager.toString());
    }
}
