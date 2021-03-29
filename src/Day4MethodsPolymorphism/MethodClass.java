package Day4MethodsPolymorphism;

public class MethodClass {
    public static void main(String[] args){
        ArithmeticOperation objName=new ArithmeticOperation();
        int value1 = objName.sum(4,5);
        System.out.println("Sum = " + value1);
        objName.display();
        System.out.println(objName.multiply(4,5));
        test();
    }

    public static void test(){
        System.out.println("Just to show static method");
    }


}

class ArithmeticOperation{
    public int sum(int x,int y)
    {
        return x+y;
    }
    private int subtract(int x,int y){
        return y-x;
    }
    public void display(){
        int value2= subtract(3,4);
        System.out.println(value2);
    }
    protected int multiply(int x,int y){
        return x*y;
    }
}