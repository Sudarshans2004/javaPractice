package iinterface;

public interface MarkerInterface {
    interface marker{

    }
    class a implements marker {
        void show(){
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        a obj = new a ();
        if(obj instanceof marker)  {
            System.out.println("marker interface");
        }
    }
}
