package polymorphism;

public class Ques9 {
//10) What will be the outcome of the following program? - >
      void calculate(int a, int b)
        {
            System.out.println("Class X");
        }
    }

    class YY extends Ques9
    {
        @Override
        void calculate(int a, int b)
        {
            System.out.println("Class Y");
        }
    }

    class Z extends YY
    {
        @Override
        void calculate(int a, int b)
        {
            System.out.println("Class Z");
        }
    }

     class MainnClass
    {
        public static void main(String[] args)
        {
            Ques9 x = new YY();

            x.calculate(10, 20); //  y

            YY y = (YY) x;

            y.calculate(50, 100); //y

            Z z = (Z) y;

            z.calculate(100, 200); //class cast excetion
        }

}
