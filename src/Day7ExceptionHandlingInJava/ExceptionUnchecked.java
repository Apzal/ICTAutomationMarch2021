package Day7ExceptionHandlingInJava;

public class ExceptionUnchecked {

    static void firstFunc(int age)
    {
        //ClassName objName=new ClassName();
        if(age<18)
        {
            throw new ArithmeticException("Not valid age");
        }

    }
//    static void secondFunc(int age)
//    {
//        try {
//            firstFunc(age);
//        }
//        catch(ArithmeticException e)
//        {
//            System.out.println("Arithmetic Exception handled in Function secondFunc");
//        }
//
//    }

    public static void main(String[] args) {

        try {
            firstFunc(13);
        }
        catch (ArithmeticException a)
        {
            System.out.println("Arithmetic Exception handled in main()"+ a);
        }
    }
}
