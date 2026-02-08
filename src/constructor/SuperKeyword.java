package constructor;

import org.w3c.dom.ls.LSOutput;

//    we dont have to write super keyword explicitly constructor automatically ads after construcctor
//    SuperKeyword(){
////        here jvm autoatically adds super
//
//    }
     class parent {
        parent (){
            System.out.println("Parent constructor");
        }
    }
    class child extends parent {
        child(){
//            here is super keyword which automatically calls Parent constructor
            System.out.println("child constructor");
        }
    }
public class SuperKeyword {

    public static void main(String[] args) {
        child c = new child();
    }
}
