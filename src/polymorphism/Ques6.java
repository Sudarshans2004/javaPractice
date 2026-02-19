package polymorphism;
//7) What will be the outcome of the below program? <- Stack overflow method

public class Ques6 {

        double overloadedMethod(double d)
        {
            return d *= d;
        }

        int overloadedMethod(int i)
        {
            return overloadedMethod(i *= i);
        }

        float overloadedMethod(float f)
        {
            return overloadedMethod(f *= f);
        }

        public static void main(String[] args)
        {
            Ques6 main = new Ques6();

            System.out.println(main.overloadedMethod(100));

        }


}
