public class Manusia {
    private String nama;
    private boolean jenisKelamin; // true: laki-laki, false: perempuan
    private String nik;
    private boolean menikah;

    // Constructor
    public Manusia(String nama, boolean jenisKelamin, String nik, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    // Getter and Setter methods
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public boolean isJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public boolean isMenikah() {
        return menikah;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    // Method to calculate tunjangan
    public double getTunjangan() {
        double tunjangan = 0;
        if (menikah) {
            tunjangan = jenisKelamin ? 25 : 20; // true: laki-laki, false: perempuan
        } else {
            tunjangan = 15;
        }
        return tunjangan;
    }

    // Method to calculate pendapatan
    public double getPendapatan() {
        return getTunjangan(); // for simplicity, assuming tunjangan is the only income
    }

    // toString method
    public String toString() {
        String jenis = jenisKelamin ? "Laki-laki" : "Perempuan";
        return "Nama: " + nama + "\nNIK: " + nik + "\nJenis Kelamin: " + jenis + "\nPendapatan: $" + getPendapatan();
    }
}
