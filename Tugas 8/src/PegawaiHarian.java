public class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    @Override
    public double gaji() {
        int jamNormal = 40;
        if (totalJam <= jamNormal) {
            return totalJam * upahPerJam;
        } else {
            return (jamNormal * upahPerJam) + ((totalJam - jamNormal) * upahPerJam * 1.5);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nPegawai Harian\nUpah per Jam: " + upahPerJam + "\nTotal Jam: " + totalJam + "\nGaji: " + gaji();
    }
}
