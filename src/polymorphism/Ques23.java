package polymorphism;


    class Ques23
    {

    }

    class Bb extends Ques23
    {

    }

    class Cc extends Bb
    {

    }

     class MainClasas
    {
        public static void main(String[] args)
        {
            Ques23 a = new Ques23();

            a = new Bb();

            a = new Cc();
        }


}
