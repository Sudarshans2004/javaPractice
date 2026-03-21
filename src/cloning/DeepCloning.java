package cloning;
import java.lang.Cloneable;

class Car {
    int i;

    Car(int i) {
        this.i = i;

    }
}
    class Engine implements Cloneable{
        int j;
        Car c ;
        Engine(int j , Car c){
            this.j=j;
            this.c =c;
        }
        public Object clone() throws CloneNotSupportedException{
            Car c1 = new Car(c.i);
            Engine e = new Engine(j,c1);
            return e;
        }
    }
public class DeepCloning {
    public static void main(String[] args)  throws  CloneNotSupportedException{
        Car c = new Car(20);
        Engine e = new Engine(200,c);
        System.out.println(e.j+"--"+e.c.i);
        Engine e1 = (Engine) e.clone();
        e1.j=888;
        e1.c.i=999;
        System.out.println(e1.j+"--"+e1.c.i);
    }
}
