package Day6Interfaces;

class CalculatorImplementation implements CalculatorInterface, AdvancedCalculatorInterface{

    public void addition(int a,int b)
    {
        int sum=a+b;
        System.out.println("Addition : "+sum);
    }
//    public void squareRoot(int a)
//    {
//        AdvancedCalculatorInterface.super.squareRoot(a);
//
//    }
//    public void squareRoot(int a)
//    {
//        System.out.println("Square Root "+Math.sqrt(a));
//    }


}
