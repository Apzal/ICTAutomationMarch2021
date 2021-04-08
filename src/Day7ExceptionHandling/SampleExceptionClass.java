package Day7ExceptionHandling;

public class SampleExceptionClass {

    public static void main(String args[])
    {
        try {
//            int div = 3 / 0;
//            String s=null;
//            System.out.println(s.length());
//              String str="java";
//              int i=Integer.parseInt(str);
            int[] arr= {1,5,7};
            System.out.println(arr[3]);



        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch (NullPointerException e)
        {
            System.out.println(e);
        }
        catch (NumberFormatException e)
        {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
