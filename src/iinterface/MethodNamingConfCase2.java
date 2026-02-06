package iinterface;

public interface MethodNamingConfCase2 {

        interface a {
            String sound();
        }
        interface b{
            void sound(int a);
        }

        //        Case 2 diffrent parametere
        class c implements a, b {
            @Override
            public String sound() {

                return null;
            }
            public void sound(int a) {

            }

        }
    }


