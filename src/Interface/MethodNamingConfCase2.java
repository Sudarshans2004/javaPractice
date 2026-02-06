package Interface;

public interface MethodNamingConfCase2 {

        interface a {
            void sound();
        }
        interface b{
            void sound(int a);
        }

        //        Case 2 diffrent parametere
        class c implements a, b {
            @Override
            public void sound() {

            }
            public void sound(int a) {

            }

        }
    }


