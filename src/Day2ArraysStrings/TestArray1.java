package com.company;

public class TestArray1 {


   /* public static void main(String[] args) {
        int[] myList = {10, 25, 34, 15};

        // Print all the array elements
        for (int element: myList) {
            System.out.println(element);
        }
    } */

    public static void main(String[] args) {
        int[] myList = new int[10];

        for (int i=1;i<=10;i++)
        {
            myList[i-1]=i*20;

        }
        // Print all the array elements
        for (int element: myList) {
            System.out.println(element);
        }
    }
}