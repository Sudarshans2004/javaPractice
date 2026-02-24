package polymorphism;

public class Ques21 {

        int method(int i)
        {
            return i *= i;
        }
    }

    class y extends Ques21
    {
        double method(double d)
        {
            return d /= d;
        }
    }

    class z extends y
    {
        float method(float f)
        {
            return f += f;
        }
    }

     class MainClasss
    {
        public static void main(String[] args)
        {
            z z = new z();

            System.out.println(z.method(21.12)); //1.0
        }

}
