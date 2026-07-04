package exceptionhandling;

class TooOldException extends RuntimeException {
    TooOldException(String s) {
        super(s);
    }
}

class TooYoungException extends RuntimeException {
    TooYoungException(String s) {
        super(s);
    }
}

public class CustomisedExceptionHandling {
    public static void main(String[] args) {

        try {
            int age = Integer.parseInt(args[0]);

            if (age > 60) {
                throw new TooOldException("Your age has crossed marriage age");
            } else if (age < 18) {
                throw new TooYoungException("Please wait some years, you will get match soon");
            } else {
                throw new tooFunnyexp("ohh god you are too funny");
//                System.out.println("You will get match details soon");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please provide age as command line argument");
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid number");
        } catch (TooOldException | TooYoungException e) {
            System.out.println(e.getMessage());
        }
    }
}
class tooFunnyexp extends RuntimeException{
    tooFunnyexp(String s){
        super(s);
    }
}