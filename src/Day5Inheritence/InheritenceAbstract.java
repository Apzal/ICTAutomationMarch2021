package Day5Inheritence;

abstract class MyClass{

    public abstract void display();
    public void display2(){
        System.out.println("myclass");
    }

}

class myChildClass extends MyClass{
   int x,y,z;
    @Override
    public void display() {
        System.out.println("new display");
    }

}

public class InheritenceAbstract {

    public static void main(String[] args) {

        // MyClass ob=new MyClass(); //No that won't work!

        myChildClass ob=new myChildClass();
        ob.display();
        ob.display2();
    }

}
