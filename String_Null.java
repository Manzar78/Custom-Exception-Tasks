package Custom_Exception;

class StringException extends Exception {
    public StringException(String Message){
        super(Message);
    }
}

public class String_Null {

    public static void checkString(String str) throws StringException{
        str = null;
        if (str == null){
            throw new StringException("Hey Boy String is Null ");
        }
        else {
            System.out.println("String is not null keep working");
        }

    }


    public static void main(String[] args) {
        try{
            checkString(null);
        }
        catch (StringException e){
            System.out.println("String is null your application is crash sorry");
            System.out.println("Exception is "+e);
        }
    }
}
