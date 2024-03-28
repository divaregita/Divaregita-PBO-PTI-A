public class Test {
    public static void main(String [] args) {
        Student s1 = new Student();
        s1.setName("Enkapsulasi");
        s1.setMark(90);
        System.out.println("s1Name is " + s1.getName());
        System.out.println("s1Mark is " + s1.getMark());
    }
}

// // public class Test {
// //     public static void main(String[] args) {
// //         // Membuat objek Student
// //         Student s1 = new Student();
        
// //         // Mengatur nama dan nilai siswa
// //         s1.setName("Enkapsulasi");
// //         s1.setMark(90); // Menggunakan nilai integer
        
// //         // Mendapatkan nama dan nilai siswa menggunakan method get
// //         String studentName = s1.getName();
// //         int studentMark = s1.getMark();
        
// //         // Menampilkan nama dan nilai siswa
// //         System.out.println("s1Name is " + studentName);
// //         System.out.println("s1Mark is " + studentMark);
        
// //         // Menampilkan nama dan nilai siswa tanpa menggunakan method get
// //         System.out.println("name dan mark " + studentName + " " + studentMark);
// //     }
// // }

// no3
// public class Test {
//     private String name;
//     private int mark;

//     public void setName(String n) {
//         name = n;
//     }

//     public String getName() {
//         return name;
//     }

//     public void setMark(int m) {
//         mark = m;
//     }

//     public int getMark() {
//         return mark;
//     }
// }
