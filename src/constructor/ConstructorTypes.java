package constructor;

public class ConstructorTypes {
    int x ;
    private ConstructorTypes(){
        System.out.println("No-Arg Constructor");
    }
//    ConstructorTypes(int x){
//        System.out.println("Paramterised Constructor");
//    }
    public static void main(String[] args) {
//        default construtor
        ConstructorTypes obj = new ConstructorTypes();
    }

}

