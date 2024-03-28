public class Pelanggan {
    private int nomorPelanggan;
    private String nama;
    private double saldo;

    public Pelanggan(int nomorPelanggan, String nama, double saldo) {
        this.nomorPelanggan = nomorPelanggan;
        this.nama = nama;
        this.saldo = saldo;
    }

    public int getNomorPelanggan() {
        return nomorPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public double getSaldo() {
        return saldo;
    }

    public void tambahSaldo(double jumlah) {
        saldo += jumlah;
    }

    public boolean tarikSaldo(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            return true;
        } else {
            System.out.println("Saldo tidak mencukupi.");
            return false;
        }
    }
}

// // no 2.1
// public class Pelanggan {
//     private long nomorPelanggan;
//     private String nama;
//     private double saldo;

//     public Pelanggan(long nomorPelanggan, String nama, double saldo) {
//         this.nomorPelanggan = nomorPelanggan;
//         this.nama = nama;
//         this.saldo = saldo;
//     }

//     public long getNomorPelanggan() {
//         return nomorPelanggan;
//     }

//     public String getNama() {
//         return nama;
//     }

//     public double getSaldo() {
//         return saldo;
//     }

//     public void tambahSaldo(double jumlah) {
//         saldo += jumlah;
//         int jenisRekening = (int) (nomorPelanggan / 100000000);
//         if (jenisRekening == 38 && jumlah > 1000000) {
//             double cashback = jumlah * 0.05;
//             saldo += cashback;
//             System.out.println("Anda mendapat cashback sebesar " + cashback);
//         }
//     }

//     public boolean tarikSaldo(double jumlah) {
//         if (saldo >= jumlah) {
//             saldo -= jumlah;
//             return true;
//         } else {
//             System.out.println("Saldo tidak mencukupi.");
//             return false;
//         }
//     }
// }

// // no 2.2
// public class Pelanggan {
//     private long nomorPelanggan;
//     private String nama;
//     private double saldo;

//     public Pelanggan(long nomorPelanggan, String nama, double saldo) {
//         this.nomorPelanggan = nomorPelanggan;
//         this.nama = nama;
//         this.saldo = saldo;
//     }

//     public long getNomorPelanggan() {
//         return nomorPelanggan;
//     }

//     public String getNama() {
//         return nama;
//     }

//     public double getSaldo() {
//         return saldo;
//     }

//     public void tambahSaldo(double jumlah) {
//         saldo += jumlah;
//         int jenisRekening = (int) (nomorPelanggan / 100000000);
//         if (jenisRekening == 38) {
//             if (jumlah > 1000000) {
//                 double cashback = jumlah * 0.05;
//                 saldo += cashback;
//                 System.out.println("Anda mendapat cashback sebesar " + cashback);
//             }
//         }
//         else if (jenisRekening == 56) {
//             if (jumlah > 1000000) {
//                 double cashback = jumlah * 0.07;
//                 saldo += cashback;
//                 System.out.println("Anda mendapat cashback sebesar " + cashback);
//             } else {
//                 double cashback = jumlah * 0.02;
//                 saldo += cashback;
//                 System.out.println("Anda mendapat cashback sebesar " + cashback);
//             }
//         }
//     }

//     public boolean tarikSaldo(double jumlah) {
//         if (saldo >= jumlah) {
//             saldo -= jumlah;
//             return true;
//         } else {
//             System.out.println("Saldo tidak mencukupi.");
//             return false;
//         }
//     }
// }

// // no 2.3
// public class Pelanggan {
//     private long nomorPelanggan; // Menggunakan long untuk menampung nomor pelanggan 10 digit
//     private String nama;
//     private double saldo;

//     public Pelanggan(long nomorPelanggan, String nama, double saldo) {
//         this.nomorPelanggan = nomorPelanggan;
//         this.nama = nama;
//         this.saldo = saldo;
//     }

//     public long getNomorPelanggan() {
//         return nomorPelanggan;
//     }

//     public String getNama() {
//         return nama;
//     }

//     public double getSaldo() {
//         return saldo;
//     }

//     public void tambahSaldo(double jumlah) {
//         saldo += jumlah;
        
//         // Menentukan jenis rekening berdasarkan dua digit pertama nomor pelanggan
//         int jenisRekening = (int) (nomorPelanggan / 100000000); // Ambil dua digit pertama
        
//         // Cek jenis rekening
//         switch (jenisRekening) {
//             case 38: // Silver
//                 if (jumlah > 1000000) {
//                     double cashbackSilver = jumlah * 0.05;
//                     saldo += cashbackSilver;
//                     System.out.println("Anda mendapat cashback sebesar " + cashbackSilver);
//                 }
//                 break;
//             case 56: // Gold
//                 if (jumlah > 1000000) {
//                     double cashbackGold = jumlah * 0.07;
//                     saldo += cashbackGold;
//                     System.out.println("Anda mendapat cashback sebesar " + cashbackGold);
//                 } else {
//                     double cashbackGold = jumlah * 0.02;
//                     saldo += cashbackGold;
//                     System.out.println("Anda mendapat cashback sebesar " + cashbackGold);
//                 }
//                 break;
//             case 74: // Platinum
//                 if (jumlah > 1000000) {
//                     double cashbackPlatinum = jumlah * 0.10;
//                     saldo += cashbackPlatinum;
//                     System.out.println("Anda mendapat cashback sebesar " + cashbackPlatinum);
//                 } else {
//                     double cashbackPlatinum = jumlah * 0.05;
//                     saldo += cashbackPlatinum;
//                     System.out.println("Anda mendapat cashback sebesar " + cashbackPlatinum);
//                 }
//                 break;
//             default:
//                 System.out.println("Jenis rekening tidak valid.");
//         }
//     }

//     public boolean tarikSaldo(double jumlah) {
//         if (saldo >= jumlah) {
//             saldo -= jumlah;
//             return true;
//         } else {
//             System.out.println("Saldo tidak mencukupi.");
//             return false;
//         }
//     }
// }

// // no 3
// public class Pelanggan {
//     private long nomorPelanggan;
//     private String nama;
//     private double saldo;
//     private final double SALDO_MINIMAL = 10000;

//     public Pelanggan(long nomorPelanggan, String nama, double saldo) {
//         this.nomorPelanggan = nomorPelanggan;
//         this.nama = nama;
//         this.saldo = saldo;
//     }

//     public long getNomorPelanggan() {
//         return nomorPelanggan;
//     }

//     public String getNama() {
//         return nama;
//     }

//     public double getSaldo() {
//         return saldo;
//     }
// }

//      int jenisRekening = (int) (nomorPelanggan / 100000000);
//         switch (jenisRekening) {
//             case 38:
//                 if (jumlah > 1000000) {
//                     double cashbackSilver = jumlah * 0.05;
//                     saldo += cashbackSilver;
//                     System.out.println("Anda mendapat cashback sebesar " + cashbackSilver);
//                 }
//                 break;
//             case 56:
//                 if (jumlah > 1000000) {
//                     double cashbackGold = jumlah * 0.07;
//                     saldo += cashbackGold;
//                     System.out.println("Anda mendapat cashback sebesar " + cashbackGold);
//                 } else {
//                     double cashbackGold = jumlah * 0.02;
//                     saldo += cashbackGold;
//                     System.out.println("Anda mendapat cashback sebesar " + cashbackGold);
//                 }
//                 break;
//             case 74:
//                 if (jumlah > 1000000) {
//                     double cashbackPlatinum = jumlah * 0.10;
//                     saldo += cashbackPlatinum;
//                     System.out.println("Anda mendapat cashback sebesar " + cashbackPlatinum);
//                 } else {
//                     double cashbackPlatinum = jumlah * 0.05;
//                     saldo += cashbackPlatinum;
//                     System.out.println("Anda mendapat cashback sebesar " + cashbackPlatinum);
//                 }
//                 break;
//             default:
//                 System.out.println("Jenis rekening tidak valid.");
//         }
//     }

//     public boolean tarikSaldo(double jumlah) {
//         if (saldo - jumlah >= SALDO_MINIMAL) {
//             saldo -= jumlah;
//             return true;
//         } else {
//             System.out.println("Transaksi gagal. Saldo minimal Rp10.000.");
//             return false;
//         }
//     }
// }

// no 4
// public class Pelanggan {
//     private long nomorPelanggan;
//     private String nama;
//     private double saldo;
//     private int PIN;
//     private final double SALDO_MINIMAL = 10000;

//     public Pelanggan(long nomorPelanggan, String nama, double saldo, int PIN) {
//         this.nomorPelanggan = nomorPelanggan;
//         this.nama = nama;
//         this.saldo = saldo;
//         this.PIN = PIN;
//     }

//     // Getter untuk PIN
//     public int getPIN() {
//         return PIN;
//     }

//     // Metode untuk verifikasi PIN
//     public boolean verifikasiPIN(long nomorPelanggan, int pin) {
//         return this.nomorPelanggan == nomorPelanggan && this.PIN == pin;
//     }

//     // Getter dan setter lainnya
//     public long getNomorPelanggan() {
//         return nomorPelanggan;
//     }

//     public String getNama() {
//         return nama;
//     }

//     public double getSaldo() {
//         return saldo;
//     }

//     public void tambahSaldo(double jumlah) {
//         saldo += jumlah;
//     }

//     public boolean tarikSaldo(double jumlah) {
//         if (saldo - jumlah >= SALDO_MINIMAL) {
//             saldo -= jumlah;
//             return true;
//         } else {
//             System.out.println("Transaksi gagal. Saldo minimal Rp10.000.");
//             return false;
//         }
//     }
// }

// public class Pelanggan {
//     private int nomorPelanggan;
//     private String nama;
//     private double saldo;
//     private int pin;

//     public Pelanggan(int nomorPelanggan, String nama, double saldo, int pin) {
//         this.nomorPelanggan = nomorPelanggan;
//         this.nama = nama;
//         this.saldo = saldo;
//         this.pin = pin;
//     }

//     public int getNomorPelanggan() {
//         return nomorPelanggan;
//     }

//     public double getSaldo() {
//         return saldo;
//     }

//     public int getPIN() {
//         return pin;
//     }

//     public void tambahSaldo(double jumlah) {
//         this.saldo += jumlah;
//     }
// }
