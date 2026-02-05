package Interface;

public interface Interface {
    interface animal {
        void sound();
    }
       abstract class dog implements animal{

         @Override
         public void sound() {

         }
     }
    class cat extends dog{

    }
    interface a{

    }
    class b{

    }

     class c extends b implements a {

    }




}
