package Day5Inheritence;

//What?Why?


//class1
class class1{
    int a=7;
    int b=77;
    private int c=777;
}

//class2 <-- class 1
class class2 extends class1{
    int d=4;
    int e=4;
}

//class3 <-- class2
class class3 extends class2{
    int f=5;
    int g=5;
    int h=5;
}

public class Inheritance {
    public static void main(String[] args) {
        System.out.println("Inheritance,Types,Usage with Examples");

        class2 obj2=new class2();
        System.out.println(obj2.a);

        class3 obj3=new class3();
        System.out.println(obj3.a);


//        Error if try to access private variable
//        System.out.println(obj3.c);

    }

}
