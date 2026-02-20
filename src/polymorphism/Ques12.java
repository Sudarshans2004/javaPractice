package polymorphism;

public class Ques12 {
//14) What will be the output of this program?
// Superclass
        void superClassMethod(Number n)
        {
            System.out.println("From Super Class");
        }
    }

    class SubClass extends Ques12
    {
        void superClassMethod(Double d)
        {
            System.out.println("From Sub Class");
        }
    }
     class MainCClass
    {
        public static void main(String[] args)
        {
            Ques12 sub = new SubClass();

            sub.superClassMethod(123321);
        }
}
