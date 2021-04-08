package Day7ExceptionHandling;

public class CustomInvalidAgeException extends Exception{
    CustomInvalidAgeException(String s)
    {
        super(s);
    }
}
