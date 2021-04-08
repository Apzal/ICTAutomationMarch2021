package Day7ExceptionHandling;

public class AgeValidatorClass {
    public static void main(String[] args) {
        try
        {

            validate(13);

        }
        catch (Exception e)
        {
            System.out.println("Exception occured : "+e);
        }

    }
    static void validate(int age) throws CustomInvalidAgeException
    {
        if(age<18)
        {
            throw new CustomInvalidAgeException("Age not valid");
        }
        else
        {
            System.out.println("Permission to vote");
        }
    }
}
