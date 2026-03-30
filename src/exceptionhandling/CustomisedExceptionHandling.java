package exceptionhandling;

class tooOldException extends RuntimeException{
    tooOldException(String s ){
        super(s);
    }
}
class tooYoungException extends RuntimeException{
    tooYoungException(String s){
        super(s);
    }
}
public class CustomisedExceptionHandling {
    public static void main(String[] args) {
        int age =Integer.parseInt(args[0]);
        if(age>60){
            throw new tooOldException("Your age have crossed marriage age");
        } else if (age<18) {
            throw new tooYoungException("Plz wait some yrs you will get match soon");
        }else{
            System.out.println("you will get match details soon");
        }
    }
}
