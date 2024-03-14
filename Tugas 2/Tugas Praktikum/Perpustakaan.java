import java.util.*;

class Buku {
    String judul;
    List<String> penulis;

    Buku(String judul, List<String> penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }
}

public class Perpustakaan {
    public static void main(String[] args) {
        Map<String, List<Buku>> koleksiBuku = new HashMap<>();
        koleksiBuku.put("Filsafat", Arrays.asList(
            new Buku("Being and Time", Arrays.asList("Martin Heidegger")),
            new Buku("Filsafat Pancasila", Arrays.asList("Achmad Tirtosudiro")),
            new Buku("Pandangan Hidup Muslim Indonesia", Arrays.asList("Nurcholish Madjid")),
            new Buku("Filosofi Teras", Arrays.asList("Henry Manampiring")),
            new Buku("The Republic", Arrays.asList("Plato"))
        ));

        koleksiBuku.put("Fiksi", Arrays.asList(
            new Buku("Maryam", Arrays.asList("Okky Madasari")),
            new Buku("Sirkus Pohon", Arrays.asList("Ahmad Tohari")),
            new Buku("Sirkus Sastra", Arrays.asList("Putu Wijaya")),
            new Buku("Laskar Pelangi", Arrays.asList("Andrea Hirata")),
            new Buku("Perahu Kertas", Arrays.asList("Dee Lestari"))
        ));

        for (String kategori : koleksiBuku.keySet()) {
            System.out.println("Kategori: " + kategori);
            for (Buku buku : koleksiBuku.get(kategori)) {
                System.out.println("Judul: " + buku.judul);
                System.out.println("Penulis: " + String.join(", ", buku.penulis));
                System.out.println();
            }
            System.out.println();
        }
    }
}
