public class Murid {
    private String nama;
    private String jenisKelamin;
    private int usia;

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

    // Method untuk menampilkan informasi murid
    public void displayInfo() {
        System.out.println("Nama Murid: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Usia: " + usia);
    }

    public static void main(String[] args) {
        // Membuat objek Murid
        Murid murid = new Murid();
        murid.setNama("Devina Farenta");
        murid.setJenisKelamin("Perempuan");
        murid.setUsia(17);

        // Memanggil method untuk menampilkan informasi murid
        murid.displayInfo();
    }
}
       
