package Day6Interfaces;

class Calculator {
    public static void main(String args[]) {
        CalculatorInterface calcInt = new CalculatorImplementation();
        //CalculatorInterface calcInt = new CalculatorInterface();
        calcInt.addition(3, 5);
//        AdvancedCalculatorInterface advCalcInt = new CalculatorImplementation();
//        advCalcInt.squareRoot(25);
//        calcInt.squareRoot(25);
            CalculatorInterface.square(25);

    }
}