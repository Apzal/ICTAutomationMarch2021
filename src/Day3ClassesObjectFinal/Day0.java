package Day3ClassesObjectFinal;

public class Day0 extends FinalKeyword{
    public static void main(String[] args) {
        ObjectsAndClasses obj = new ObjectsAndClasses();
        obj.PrintFunction();
        obj.x = "Test";
        Day0 test = new Day0();
        test.Print();
    }
       public void Print(){
            int k = ObjectsAndClasses.y;
            System.out.println("Static Variable" + k);

    }
    //Final Method
    /*public void test()
    {

    }*/
    }

