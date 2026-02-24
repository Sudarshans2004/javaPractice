package polymorphism;

public class Ques17 {

        public Ques17(int i)
        {
            System.out.println(1);
        }

        public Ques17()
        {
            this(10);

            System.out.println(2);
        }

        void Ques17()
        {
            Ques17(10);

            System.out.println(3);
        }

        void Ques17(int i)
        {
            System.out.println(4);
        }
    }


     class MainClaass
    {
        public static void main(String[] args)
        {
            new Ques17().Ques17(); //1,2,4,3

        }


}
