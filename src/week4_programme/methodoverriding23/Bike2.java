package week4_programme.methodoverriding23;

class Bike2 extends Vehicle {
    public static void main(String args[]) {
        Bike2 obj = new Bike2();
        obj.run();
    }

    public void run() {
        System.out.println("Bike is running safely");
    }
}