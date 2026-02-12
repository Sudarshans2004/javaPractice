package methodoverloading;

// 1)) All methods with same method signature should occour in same class

public class MethodOverloadingRules {
    void show(int x) {

    }
//    2 ) we cannot write two methods with same signature
//    void show(int x )
//}3)  Method should have diff param list differing in:
//     a)) differing in no of parameters
    void show(int x ,int y){

    }
//    b) differing in datatypes
    void show(String s){

    }
//    c)) differing in order of datatypes
    void show(String st , int z ){

    }
    void show(int z,String s){

    }
//    4)) Changing only return type is not sufficient

//    void show (int z ,String s){
//        return x;
//    }
//     5)) Methods can have access modfiers : public private protected
    private void show(char c){

    }
    public void show (int x ,int y ,int z){

    }
    protected void show(String s , String st){

    }
}