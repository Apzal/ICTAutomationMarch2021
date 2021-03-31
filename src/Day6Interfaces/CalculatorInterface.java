package Day6Interfaces;

public interface CalculatorInterface
{

      void addition(int a,int b);


      //void subtraction(int a, int b);
//    public abstract void subtraction(int a,int b);
//    public abstract void multiplication(int a, int b);
//    public abstract void division(int a,int b);
      default void squareRoot(int a)
      {
            System.out.println(Math.sqrt(a));
      }
      static void square(int a)
      {
            System.out.println(a*a);
      }

}



