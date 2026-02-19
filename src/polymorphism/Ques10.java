package polymorphism;

//11) Will you find out the error in the below code?
public class Ques10 {
    class X
    {
        static void methodOfX()
        {
            System.out.println("Class X");
        }
    }

    class Y extends X
    {
//        @Override - > this is not overriding this is method hiding
        static void methodOfX()
        {
            System.out.println("Class X");
        }

        public static void main(String[] args) {

        }
    }

}
