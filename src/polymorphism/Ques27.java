package polymorphism;

public class Ques27 {

        void myMethod(Object o, Double D)
        {
            System.out.println(1);
        }

        void myMethod(Integer I, Number N)
        {
            System.out.println(2);
        }
    }

    class BB extends Ques27
    {
        void myMethod(Float F, Double D)
        {
            System.out.println(3);
        }

        void myMethod(Double D, Integer I)
        {
            System.out.println(4);
        }
    }

     class MainClassb
    {
        public static void main(String[] args)
        {
            BB b = new BB();

            b.myMethod(11.11, 0000);//4

            b.myMethod(8778, 3223);//2

            b.myMethod(2.3*1.2, 4.1*1.4);//1

            b.myMethod((float)23.56, 21.45);//3
        }


}
