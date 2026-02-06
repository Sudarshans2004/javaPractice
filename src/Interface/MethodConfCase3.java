package Interface;

public interface MethodConfCase3 {

        interface a {
            public String sound();
        }
        interface b{
            void sound(int a);
        }

        //        Case 2 diffrent return type same signature
        class c implements Interface.MethodNamingConfCase2.a, Interface.MethodNamingConfCase2.b {
            @Override
            public String sound() {

                return null;
            }
            public void sound(int a) {

            }

        }




}
