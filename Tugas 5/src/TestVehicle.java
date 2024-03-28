public class TestVehicle1{
    public static void main(String[] args){
    System.out.println("Creating a vehicle with a 10,000 kg maximumload.");
    Vehicle1 vehicle = new Vehicle1(10000); System.out.println("Add box #1 (500kg) : " +
    vehicle.addBox(500));
    System.out.println("Add box #2 (250kg) : " + vehicle.addBox(250));
    System.out.println("Add box #3 (5000kg) : " + vehicle.addBox(5000));
    System.out.println("Add box #4 (4000kg) : " + vehicle.addBox(4000));
    System.out.println("Add box #5 (300kg) : " + vehicle.addBox(300));
    System.out.println("Vehicle load is "
    +vehicle.getLoad() + "kg");
    }
    }

// no 2
// public class TestVehicle1 {
//     public static void main(String[] args) {
//         System.out.println("Creating a vehicle with a 10,000 kg maximum load.");
//         Vehicle1 vehicle = new Vehicle1(10000.0);
//         System.out.println("Add box #1 (500kg) : " + vehicle.addBox(500.0));
//         System.out.println("Add box #2 (250kg) : " + vehicle.addBox(250.0));
//         System.out.println("Add box #3 (5000kg) : " + vehicle.addBox(5000.0));
//         System.out.println("Add box #4 (4000kg) : " + vehicle.addBox(4000.0));
//         System.out.println("Add box #5 (300kg) : " + vehicle.addBox(300.0));
//         System.out.println("Vehicle load is " + vehicle.getLoad() + "kg");
//         System.out.println("Add load(100kg) : " + (vehicle.getLoad() + 100)); 
//     }
// }

// no 3
// public class TestVehicle1 {
//     public static void main(String[] args) {
//         Vehicle1 vehicle = new Vehicle1(1000);
//         System.out.println("Add load(100kg) : " + (vehicle.load = 500));
//     }
//  }

// // no 5
// public class TestVehicle1 {
//     public static void main(String[] args) {
//         Vehicle1 vehicle = new Vehicle1(1000);
//         System.out.println("Add load(100kg) : " + (vehicle.load = 500));
//     }
// }
