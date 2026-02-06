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

            }
        }
}
