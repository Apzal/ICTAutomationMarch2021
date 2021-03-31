package Day4MethodsPolymorphism;

public class MethodOverloadingClass {
    public static void main(String[] args){

        MethodOverloadingClass objName=new MethodOverloadingClass();
        int value1=objName.addition(3,4);
        int value2= objName.addition(4.5,5.6);
        int value3=objName.addition(5,7,8);
        int value4=objName.addition(5,5.6);
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
    }

    public int addition(int x, int y){
        return x+y;
    }
    public int addition(int x,int y,int z){
        return x+y+z;
    }
    public int addition(double x,double y){
        return ((int)x+(int)y);
    }
    public int addition(int x,double y)
    {
        return x+(int)y;
    }
}
