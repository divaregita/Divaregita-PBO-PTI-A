public class Mahasiswa extends Civitas {
    private String nim;
    private double ipk;
    private int golUkt;

    public Mahasiswa(String nama, int umur, boolean jenisKelamin, String nim, double ipk, int golUkt) {
        super(nama, umur, jenisKelamin);
        this.nim = nim;
        this.ipk = ipk;
        this.golUkt = golUkt;
    }

    public void ngerjainTugas() {
        System.out.println(nama + " mengerjakan tugas.");
    }

    public void pasrah() {
        System.out.println(nama + " pasrah dengan hasil tugas.");
    }

    public void mengikutiOrganisasi(String namaOrganisasi) {
        System.out.println(nama + " mengikuti organisasi " + namaOrganisasi);
    }
}
