package innerclass.anonymous;

interface I {
    void m7();
}
// we can use anonymous inner classes to define methods of interface
public class Class1 {
    public static void main(String[] args) {
        I i = new I(){
            @Override
            public void m7() {

            }
        };

    }
}
