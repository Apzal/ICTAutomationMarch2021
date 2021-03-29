package Day2_loopingstatement;

import java.util.Scanner;

public class DoWhileDemo
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter the number- ");
        int i= sc.nextInt();
        do
        {
            System.out.println(+i);
            i++;
        }
        while(i<5);
    }
}
