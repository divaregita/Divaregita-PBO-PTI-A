public class Vehicle1 {
    private double load, maxLoad;

    public Vehicle1 (double max){ this.maxLoad = max;

    }
    public double getLoad(){ return this.load;
    }
    public double getMaxLoad(){ return this.maxLoad;
    }
    public boolean addBox(double weight){ double temp = 0.0D;
    temp = this.load + weight; if(temp <= maxLoad){
    this.load = this.load + weight; return true;
    }
    else
    {
    return false;
    }
    }
}

// no2
// public class Vehicle1 {
//     private double load, maxLoad;

//     public Vehicle1(double max) {
//         this.maxLoad = max;
//     }

//     public double getLoad() {
//         return this.load;
//     }

//     public double getMaxLoad() {
//         return this.maxLoad;
//     }

//     public boolean addBox(double weight) {
//         double temp = 0.0D;
//         temp = this.load + weight;
//         if (temp <= maxLoad) {
//             this.load = this.load + weight;
//             return true;
//         } else {
//             return false;
//         }
//     }
// }

// // no 3a
// public class Vehicle1 {
//     public double load, maxLoad;

//     public Vehicle1(double max) {
//         this.maxLoad = max;
//     }

//     public double getLoad() {
//         return this.load;
//     }

//     public double getMaxLoad() {
//         return this.maxLoad;
//     }

//     public boolean addBox(double weight) {
//         double temp = 0.0D;
//         temp = this.load + weight;
//         if (temp <= maxLoad) {
//             this.load = this.load + weight;
//             return true;
//         } else {
//             return false;
//         }
//     }
// }

// // no 3b
// public class Vehicle1 {
//     public double load, maxLoad;

//     public Vehicle1(double max) {
//         this.maxLoad = max;
//     }

//     public double getLoad() {
//         return this.load;
//     }

//     public double getMaxLoad() {
//         return this.maxLoad;
//     }

//     public boolean addBox(double weight) {
//         double temp = this.load + weight;
//         if (temp <= maxLoad) {
//             this.load += weight;
//             return true;
//         } else {
//             return false;
//         }
//     }
// }

// public static void main(String[] args) {
//     Vehicle1 vehicle = new Vehicle1(1000);
//     System.out.println("Add load(100kg) : " + (vehicle.load = 500));
// }

// no 4
// public class Vehicle1 {
//     protected double load, maxLoad;

//     public Vehicle1(double max) {
//         this.maxLoad = max;
//     }

//     public double getLoad() {
//         return this.load;
//     }

//     public double getMaxLoad() {
//         return this.maxLoad;
//     }

//     public boolean addBox(double weight) {
//         double temp = this.load + weight;
//         if (temp <= maxLoad) {
//             this.load += weight;
//             return true;
//         } else {
//             return false;
//         }
//     }
// }

// // no 5
// class Vehicle1 {
//     double load, maxLoad;

//     public Vehicle1(double max) {
//         this.maxLoad = max;
//     }

//     public double getLoad() {
//         return this.load;
//     }

//     public double getMaxLoad() {
//         return this.maxLoad;
//     }

//     public boolean addBox(double weight) {
//         double temp = this.load + weight;
//         if (temp <= maxLoad) {
//             this.load += weight;
//             return true;
//         } else {
//             return false;
//         }
//     }

//     public static void main(String[] args) {
//         Vehicle1 vehicle = new Vehicle1(1000);
//         System.out.println("Add load(100kg) : " + (vehicle.load = 500));
//     }
// }
