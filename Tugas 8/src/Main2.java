public class Main2 {
    public static void main(String[] args) {
        Pegawai pegawaiTetap1 = new PegawaiTetap("Bayu", "350728490327424092342", 2000000.0);
        Pegawai pegawaiHarian1 = new PegawaiHarian("Edo", "350728450327424092343", 8500.0, 40);
        Pegawai sales1 = new Sales("Tika", "350726450327424852344", 50, 50000.0);

        System.out.println(pegawaiTetap1);
        System.out.println("========================");
        System.out.println(pegawaiHarian1);
        System.out.println("========================");
        System.out.println(sales1);
        System.out.println("========================");

        // Upcasting example
        Pegawai pegawaiUpcast = new PegawaiTetap("Upcast Example", "987654321", 7000000);
        System.out.println(pegawaiUpcast);

        // Downcasting example
        PegawaiTetap pegawaiDowncast = (PegawaiTetap) pegawaiUpcast;
        System.out.println("Upah Pegawai Downcast: " + pegawaiDowncast.getUpah());
    }
}
