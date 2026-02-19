package polymorphism;

public class Ques4 {
//5) In the below Class X, is ‘method’ properly overloaded? yess

        int method(int i, int d)
        {
            return i+d;
        }

        static int method(int i, double d)
        {
            return (int)(i+d);
        }

        double method(double i, int d)
        {
            return i+d;
        }

        static double method(double i, double d)
        {
            return i+d;
        }

    public static void main(String[] args) {
        method(10,20.2);
        method(10.02,10.2);
        Ques4 q = new Ques4();
        q.method(10,10);
        q.method(0.01,10);
    }

}
