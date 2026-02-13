package methodoverriding;

// parent class private method are not available to child class

public class MathodOverridingRule5 {
    private int  m1(){
        return 10;
    }
}

class chiild extends MathodOverridingRule5{
    int m1(){
        return 100;
    }
}
class mainn {
    public static void main(String[] args) {
        MathodOverridingRule5 m = new MathodOverridingRule5();
//        m.m1(); here private method of parent is not inherited in child
        chiild c = new chiild();
        c.m1();
    }
}
