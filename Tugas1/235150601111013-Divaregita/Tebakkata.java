import java.util.Scanner;

public class Tebakkata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] kata = {"alpukat", "jambu", "pir", "manggis", "nanas"}; // Kata-kata yang harus ditebak
        String kataAcak = kata[(int) (Math.random() * kata.length)]; // Memilih kata acak dari array
        char[] tebakan = new char[kataAcak.length()]; // Array untuk menyimpan tebakan
        boolean kataTebakanBenar = false;

        // Menginisialisasi array tebakan dengan karakter '_'
        for (int i = 0; i < tebakan.length; i++) {
            tebakan[i] = '_';
        }

        System.out.println("Halo! Saya telah memilih sebuah kata. Tebak kata tersebut!");

        while (!kataTebakanBenar) {
            System.out.print("Kata: ");
            // Menampilkan kata yang telah ditebak (hanya huruf yang telah ditebak yang ditampilkan, huruf lainnya diganti dengan '_')
            for (char c : tebakan) {
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.print("Tebakan huruf: ");
            char tebakanHuruf = scanner.next().charAt(0);

            // Memeriksa apakah huruf tebakan terdapat dalam kata acak
            boolean hurufBenar = false;
            for (int i = 0; i < kataAcak.length(); i++) {
                if (kataAcak.charAt(i) == tebakanHuruf) {
                    tebakan[i] = tebakanHuruf;
                    hurufBenar = true;
                }
            }

            // Jika huruf tebakan tidak ada dalam kata acak
            if (!hurufBenar) {
                System.out.println("Huruf '" + tebakanHuruf + "' tidak ada dalam kata.");
            }

            // Memeriksa apakah kata telah ditebak dengan benar
            kataTebakanBenar = true;
            for (char c : tebakan) {
                if (c == '_') {
                    kataTebakanBenar = false;
                    break;
                }
            }
        }

        System.out.println("Selamat! Anda berhasil menebak kata: " + kataAcak);
        scanner.close();
    }
}
