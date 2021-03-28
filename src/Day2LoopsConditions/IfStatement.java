package Day2_conditionalstatements;

import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter the number- ");
        int num= sc.nextInt();
        if (num<=100){
            System.out.println("Value of num is "+num);
        }
    }
}

