public class Murid {
    private String nama;
    private String jenisKelamin;
    private int usia;

    // Constructor tanpa parameter
    public Murid() {}

    // Constructor dengan parameter nama
    public Murid(String nama) {
        this.nama = nama;
    }

    // Constructor dengan parameter nama, jenis kelamin, dan usia
    public Murid(String nama, String jenisKelamin, int usia) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public String getNama() {
        return nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public int getUsia() {
        return usia;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    // Method overload untuk menampilkan informasi murid dengan nama
    public void displayInfo(String nama) {
        System.out.println("Nama Murid: " + nama);
    }

    // Method overload untuk menampilkan informasi murid dengan nama dan jenis kelamin
    public void displayInfo(String nama, String jenisKelamin) {
        System.out.println("Nama Murid: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
    }

    // Method overload untuk menampilkan informasi murid dengan nama, jenis kelamin, dan usia
    public void displayInfo(String nama, String jenisKelamin, int usia) {
        System.out.println("Nama Murid: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Usia: " + usia);
    }

    // Method instans yang mengembalikan tipe data class itu sendiri
    public Murid getInstance() {
        return this;
    }
}
