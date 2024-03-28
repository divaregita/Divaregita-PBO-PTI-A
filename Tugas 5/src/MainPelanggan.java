public class MainPelanggan {
    public static void main(String[] args) {
        Pelanggan pelanggan1 = new Pelanggan(123456, "John Doe", 1000.0);
        Transaksi transaksi1 = new Transaksi(pelanggan1);

        transaksi1.prosesTransaksi("tambah", 500.0);
        transaksi1.prosesTransaksi("tarik", 200.0);
        transaksi1.prosesTransaksi("tarik", 2000.0);

        System.out.println("Saldo akhir: " + pelanggan1.getSaldo());
    }

    static class Transaksi {
        private Pelanggan pelanggan;

        public Transaksi(Pelanggan pelanggan) {
            this.pelanggan = pelanggan;
        }

        public void prosesTransaksi(String jenisTransaksi, double jumlah) {
            if (jenisTransaksi.equals("tambah")) {
                pelanggan.tambahSaldo(jumlah);
                System.out.println("Saldo berhasil ditambahkan.");
            } else if (jenisTransaksi.equals("tarik")) {
                if (pelanggan.tarikSaldo(jumlah)) {
                    System.out.println("Penarikan saldo berhasil.");
                } else {
                    System.out.println("Penarikan saldo gagal.");
                }
            } else {
                System.out.println("Jenis transaksi tidak valid.");
            }
        }
    }
}

// public class MainPelanggan {
//     public static void main(String[] args) {
//         // Membuat objek pelanggan
//         Pelanggan pelanggan1 = new Pelanggan(123456, "John Doe", 1000.0, 1234);

//         // Menampilkan informasi pelanggan
//         System.out.println("Informasi Pelanggan:");
//         System.out.println("Nomor Pelanggan: " + pelanggan1.getNomorPelanggan());
//         System.out.println("Nama: " + pelanggan1.getNama());
//         System.out.println("Saldo: " + pelanggan1.getSaldo());

//         // Melakukan penambahan saldo
//         pelanggan1.tambahSaldo(500.0);

//         // Menampilkan saldo setelah penambahan
//         System.out.println("Saldo setelah penambahan: " + pelanggan1.getSaldo());
//     }
// }
// }
