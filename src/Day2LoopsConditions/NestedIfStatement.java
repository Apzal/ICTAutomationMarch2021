package Day2_conditionalstatements;


import java.util.Scanner;

public class NestedIfStatement {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter the number- ");
        int num= sc.nextInt();
        if (num<=100){
            System.out.println("Value of num1 is "+num);
            if (num>50){
                System.out.println("Value of num2 is "+num);
            }
        }
    }

}