package Day7ExceptionHandling;

import java.io.IOException;

public class ExceptionUncheckedPropogation {
    void firstFunc()  {

            int age=13;
            if(age<18)
            {
                throw new ArithmeticException("Not valid age");
            }

    }
    void secondFunc()  {

        try {
            firstFunc();
        }
        catch (ArithmeticException e)
        {
            System.out.println("Exception handled in secondFunc");
        }

    }


    public static void main(String[] args) {
        ExceptionUncheckedPropogation exp=new ExceptionUncheckedPropogation();
        exp.secondFunc();
        System.out.println("Rest of the program");
    }
}
