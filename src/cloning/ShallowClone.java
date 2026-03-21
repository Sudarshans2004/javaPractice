package cloning;
import java.lang.Cloneable;
class Cat {
    int j;
    Cat(int j) {
        this.j = j;
    }
}

class Dog implements Cloneable { // Fixed: Capital 'C'
    Cat c;
    int i;

    Dog(Cat c, int i) {
        this.c = c;
        this.i = i;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // This performs a shallow copy
    }
}

public class ShallowClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cat c = new Cat(20);
        Dog d = new Dog(c, 10);

        System.out.println("Original: " + d.i + "--" + d.c.j);

        Dog d1 = (Dog) d.clone();
        d1.i = 888;
        d1.c.j = 999; // Warning: This affects both 'd' and 'd1'!

        System.out.println("Clone:    " + d1.i + "--" + d1.c.j);
        System.out.println("Original: " + d.i + "--" + d.c.j);
    }
}