public class MainStudent {
    public static void main(String[] args) {
        Student anna = new Student("Anna", "Malang", 20, 100, 80, 89);
        anna.displayMessage();
        
        System.out.println("===================");
        
        Student chris = new Student("Chris", "Kediri", 21, 70, 90, 60);
        chris.displayMessage();
    }
}
