package Day7ExceptionHandlingInJava;

import java.io.IOException;

public class MultipleCatches {

    public static void main(String[] args) {

        try{
            int a[]=new int[5];
            a[4]=30/2;
//            throw new IOException();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch(Exception e)
        {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }
}