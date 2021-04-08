package Day7ExceptionHandlingInJava;

public class CustomInvalidAgeException extends Exception{
    CustomInvalidAgeException(String s)
    {
        super(s);

    }
}
