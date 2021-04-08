package Day7ExceptionHandling;

import java.io.IOException;

public class ExceptionCheckedPropogation {
    void firstFunc() throws IOException {
        int age = 13;
        if (age < 18) {
            throw new IOException("Not valid age");
        }
    }

    void secondFunc() throws IOException {

        firstFunc();

    }

    void thirdFunc() {
        try {
            secondFunc();

        }
        catch (IOException e) {
         System.out.println("Exception caught in the function thirdFunc : " + e);
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        ExceptionCheckedPropogation exp = new ExceptionCheckedPropogation();
        exp.thirdFunc();
        System.out.println("Rest of the program");
    }
}
