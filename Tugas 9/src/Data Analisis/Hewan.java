package latihaninterface;
public class Hewan implements MakhlukHidup, Identitas {
    private String nama;
    private int umur;

    //konstruktor dengan parameter nama dan umur
    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    
    @Override
    public void makan() {
    System.out.println("Makan pakai tangan dan mulut");
    }
    @Override
    public void berjalan() {
    System.out.println("Jalan pakai 4 kaki");
    }
    @Override
    public void bersuara() {
    System.out.println("Suaranya nggak jelas");
    }
   
    public void tampilkanNama (){}
   
    public void tampilkanUmur () {}
   }
   
