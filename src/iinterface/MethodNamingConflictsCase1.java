package iinterface;

public interface MethodNamingConflictsCase1 {
        interface a {
            void sound();
        }
        interface b{
            void sound();
        }

//        Case 1 same return type and parameter
        class c implements a,b{
            @Override
            public void sound() {
                System.out.println("Sound Check");
            }
        }

    public static void main(String[] args) {
        c c = new c();
        c.sound();
    }
}
