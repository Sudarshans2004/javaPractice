package polymorphism;

public class Ques11 {
//    12) What possible types a ‘superClassMethod()’ of below ‘SuperClass’ can return when it is overridden in the sub class?
 //Ans - > can be child of Object like String StringBuilder
    class SuperClass
    {
        Object superClassMethod()
        {
            return new Object();
        }
    }
    class SubClass extends SuperClass
    {
        String superClassMethod(){
            return null;
        }
    }
}
