package Day2_conditionalstatements;

import java.util.Scanner;

public class IfElseStatement {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter the number- ");
        int num= sc.nextInt();
        if (num>100){
            System.out.println("Value is greater than 100");

        }
        else {
            System.out.println("Value is less than 100");
        }
    }

}