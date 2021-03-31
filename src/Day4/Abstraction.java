package Day4;

abstract class Vehicle {
    //abstract methods- no body in method
    abstract void start(); // declared

    //concrete methods - has a body
    void door(){
        // already implemented
        System.out.println("the color of door is white");
    }
}

class Car extends Vehicle{
    private int key;
    // overriding
    void start() { // implemented in child
        System.out.println("Starts with a key!");
    }
}

class Scooter extends Vehicle {

    void start() {
        System.out.println("Starts with a kick!");
    }

}

public class Abstraction{

    public static void main(String[] args){
       // Vehicle veh = new Vehicle();  //Not allowed. Throws compile time error

        Vehicle veh1 = new Scooter(); // Referencing the abstract class and creating object for Scooter
        veh1.start();

        Vehicle veh2 = new Car(); // Referencing the abstract class and creating object for Car
        veh2.start();
        veh2.door();


        Car car = new Car(); // Create object using Child Class and
        car.start();
        car.door();

        Scooter scoot = new Scooter(); // Create object using Child Class
        scoot.start();
    }
}
