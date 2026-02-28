package iinterface;

public interface MethodNamingConfCase2 {

        interface a {
            String sound();
        }
        interface b{
            int sound(int a);
        }
        //        Case 2 diffrent parametere
        class c implements a, b {
            @Override
            public String sound() {
                return null;
            }
            public int sound(int a) {
             return a;
            }
        }
    public static void main(String[] args) {
        c c =new c();
        c.sound();
        c.sound(10);
    }
}


