package polymorphism;


    class Ques26
    {
        public Ques26(int i)
        {
            System.out.println(myMethod(i));
        }

        int myMethod(int i)
        {
            return ++i + --i;
        }
    }

    class Ba extends Ques26
    {
        public Ba(int i, int j)
        {
            super(i*j);

            System.out.println(myMethod(i, j));
        }

        int myMethod(int i, int j)
        {
            return myMethod(i*j);
        }
    }

     class MainaClass
    {
        public static void main(String[] args)
        {
            Ba b = new Ba(12, 21);//505 //505
        }

}
