package Day7ExceptionHandlingInJava;

import java.io.BufferedInputStream;
import java.io.IOException;

public class ExceptionChecked {

    static void firstFunc(int age) throws IOException
    {
        if(age<18)
        {
            throw new IOException("Not valid age");
        }
        //BufferedInputStream br=new BufferedInputStream();

    }
    static void secondFunc(int age)
    {
        try {
            firstFunc(age);
        }
        catch(IOException e)
        {
            System.out.println("IOException handled in Function secondFunc");
        }

    }

    public static void main(String[] args) {

        secondFunc(13);
    }
}
