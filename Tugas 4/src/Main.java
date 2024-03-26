public class Main {
    
    public static void main(String[] args) {
        // Membuat objek Murid menggunakan constructor overloading
        Murid murid1 = new Murid();
        Murid murid2 = new Murid("Devina Farenta");
        Murid murid3 = new Murid("Devina Farenta", "Perempuan", 18);
    
        // Memanggil method untuk menampilkan informasi murid
        murid1.displayInfo("Murid 1");
        murid2.displayInfo("Murid 2");
        murid3.displayInfo("Murid 3");
    }
}
