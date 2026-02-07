package iinterface;

public interface MethodConfCase3 {

        interface a {
            public String sound();
        }
        interface b{
            void sound(int a);
        }

        //        Case 2 diffrent return type same signature
        class c implements a, b {
            @Override
            public String sound() {

                return null;
            }
            public void sound(int a) {

            }

        }




}
