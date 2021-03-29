package Day0;

public class ObjectsAndClasses extends FinalKeyword{
    static int y = 6; // static variable
    String x="test"; // Instance Variable

    public void PrintFunction() {
        int x= 123; // Local Variable
        System.out.println("Local variable" + " "+ x);
        System.out.println("Instance variable" + " "+ this.x);
    }

}
