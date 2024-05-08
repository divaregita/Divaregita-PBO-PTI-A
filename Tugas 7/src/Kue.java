package praktikum;

abstract class Kue {
    String nama;
    double harga;

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    abstract double hitungHarga();

    @Override
    public String toString() {
        return "Kue " + nama + " - Harga: Rp " + hitungHarga();
    }
}
