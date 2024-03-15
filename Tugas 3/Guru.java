public class Guru {
    private String nama;
    private String nip;
    private MataPelajaran mataPelajaran;

    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }

    public MataPelajaran getMataPelajaran() {
        return mataPelajaran;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setMataPelajaran(MataPelajaran mataPelajaran) {
        this.mataPelajaran = mataPelajaran;
    }

    // Method untuk menampilkan informasi guru
    public void displayInfo() {
        System.out.println("Nama Guru: " + nama);
        System.out.println("NIP: " + nip);
        System.out.println("Mata Pelajaran: " + mataPelajaran.getNama());
        System.out.println("Deskripsi Mata Pelajaran: " + mataPelajaran.getDeskripsi());
    }

    public static void main(String[] args) {
        // Membuat objek MataPelajaran
        MataPelajaran matapelajaran = new MataPelajaran();
        matapelajaran.setNama("Sejarah Indonesia");
        matapelajaran.setDeskripsi("Mata pelajaran yang mempelajari tentang sejarah dan pahlawan indonesia.");

        // Membuat objek Guru
        Guru guru = new Guru();
        guru.setNama("Susanto");
        guru.setNip("9876");
        guru.setMataPelajaran(matapelajaran);

        // Memanggil method untuk menampilkan informasi guru
        guru.displayInfo();
    }
}

class MataPelajaran {
    private String nama;
    private String deskripsi;

    public String getNama() {
        return nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
