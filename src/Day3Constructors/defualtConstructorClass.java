package Day3Constructors;

//Java Program to create and call a default constructor
class Bike1 {
    int a;
    String b;
    //creating a default constructor
    Bike1() {
        a = 0;
        b = null;
    }

    //main method
    public static void main(String args[]) {
//calling a default constructor
        Bike1 c = new Bike1();
        Bike1 d = new Bike1();
    }
}