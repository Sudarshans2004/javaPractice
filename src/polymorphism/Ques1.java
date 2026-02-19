package polymorphism;
//2) In a class, one method has two overloaded forms. One form is defined as static and another
// form is defined as non-static. Is that method properly overloaded? yes nut param list is diff
public class Ques1 {
    void m1(){
        System.out.println("m1");
    }
    static void m1(int x){
        System.out.println("m2");
    }

    public static void main(String[] args) {
        Ques1 q = new Ques1();
        m1(10);

    }
}
