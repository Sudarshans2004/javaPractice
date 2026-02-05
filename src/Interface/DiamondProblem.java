package Interface;

public interface DiamondProblem {

    interface a {
        void show();
        void display();
    }

    interface b {
        void show();
    }

    abstract class c implements a, b {
        public void show() {
            System.out.println("Show");
        }
        public void display() {
            System.out.println("Display");
        }
    }

    static class D extends c {
        public static void main(String[] args) {
            D obj = new D();
            obj.show();
            obj.display();
        }
    }
}

//

//public interface DiamondProblem {
//This I s Not Allowed in Java
    class A {
        void show() {
            System.out.println("A show");
        }
    }

    class B extends A {
        void show() {
            System.out.println("B show");
        }
    }

    class C extends A {
        void show() {
            System.out.println("C show");
        }
    }

    //  This is NOT allowed in Java
//    class D extends B, C {
//        public static void main(String[] args) {
//            D obj = new D();
//            obj.show();   // ambiguity: B.show() or C.show() ?
//        }
//    }

//}
