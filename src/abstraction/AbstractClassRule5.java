package abstraction;

public class AbstractClassRule5 {

    abstract class a {
        abstract void show();
    }
    abstract class b {
        void display() {
            System.out.println("");
        }
    }
    class c extends a{
        // Method implementation if not ERROR
        @Override
        void show() {

        }
    }
    abstract class d extends a{

    }
}
