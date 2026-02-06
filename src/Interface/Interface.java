package Interface;

public interface Interface {
    interface animal {
        void sound();
    }
       abstract class dog implements animal{

         @Override
         public abstract void sound();
     }
    class cat extends dog{

        @Override
        public void sound() {

        }
    }
    interface a{

    }
    class b{

    }

     class c extends b implements a {

    }




}
