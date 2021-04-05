package Day7ExceptionHandlingInJava;

import java.sql.SQLException;

public class ExceptionExample {
    public static void main(String args[]) throws InterruptedException, SQLException {
        try {
            Thread.sleep(1000);
            System.out.println("Open excel sheet");
            int[] a ={1,2,3,4,5};
            int i= 5;
            a[10] = 1/0;
//            int j =0;
//            i=5/j;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException handled");
//            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Generic Exception handled");
            System.out.println(e.getMessage());
            e.printStackTrace();

        } finally {
            System.out.println("Close excel sheet");
        }
        System.out.println("Continuing program");

    }
}