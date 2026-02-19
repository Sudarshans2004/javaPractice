package polymorphism;

public class Ques5 {

        void method(int a)
        {
            System.out.println("ONE");
        }

        void method(double d)
        {
            System.out.println("TWO");
        }
    }

    class Y extends Ques5
    {
        @Override
        void method(double d)
        {
            System.out.println("THREE");
        }
    }

     class Class
    {
        public static void main(String[] args)
        {
            new Y().method(100); // Which is also equal to Y y = new Y();  y.method(100)

        }


}
