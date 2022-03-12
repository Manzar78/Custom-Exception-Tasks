package Custom_Exception;
class AgeException extends Exception {
    public AgeException (String Message){
        super(Message);
    }
}

public class Invalid_Exception {
    public static void invalidAge(int age ) throws AgeException{
        if (age < 18){
            throw new AgeException("Age Is Not Valid ");
        }
        else{
            System.out.println("Age is Valid");
        }

    }

    public static void main(String[] args) {
    try {
        invalidAge(15);
    }
    catch (AgeException e){
        System.out.println("Age is Less Than 18 That's Why Age Is Not Valid");
        System.out.println("Exception is  "+ e);
    }
    }
}
