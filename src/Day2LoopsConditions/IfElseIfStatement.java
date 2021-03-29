package Day2_conditionalstatements;

import java.util.Scanner;

public class IfElseIfStatement {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number- ");
        int marks= sc.nextInt();
        char grade;

        if (marks >= 80)
        {
        grade = 'A';
        } else if (marks >= 70) {
        grade = 'B';
        } else if (marks >= 60) {
        grade = 'C';
        } else if (marks >= 50) {
        grade = 'D';
        } else {
        grade = 'F';

        }
        System.out.println("Grade = " + grade);

        }

        }