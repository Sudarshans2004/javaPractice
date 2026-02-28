package iinterface;

public interface Interface {
    interface animal {
        abstract void sound();
    }
        class dog implements animal{

         @Override
        public void sound(){
             System.out.println("bhow bhow");
         }
     }
    class cat implements animal{

        @Override
        public void sound() {
            System.out.println("Meow meow");
        }
    }
    interface a{

    }
    class b{
        void run(){

        }
    }

     class c extends b implements a {

    }
}
