package Day3Constructors;

public class StaticCheck {

    static{
        System.out.println("I am here in static");
    }

    public StaticCheck(){
        System.out.println("I am here in constructor");
    }
    public static void main(String[] args) {
        System.out.println("I am here in Main");
        StaticCheck staticCheck=new StaticCheck();
    }
}