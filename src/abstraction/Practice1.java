package abstraction;

//Create an abstract class Shape with:
//abstract method area()
//concrete method display()
//Create subclasses:
//Circle
//Rectangle
//Call methods from main.
public class Practice1 {
    static abstract class Shape{
        abstract void area ();
        void display(){
            System.out.println("Display");
        }
    }
     static class Circle extends Shape{

         @Override
         void area() {
             System.out.println("circle area pi r 2" );
         }
     }
     static class Rectangle extends Shape{
        @Override
         void area(){
            System.out.println("rectangle area");
        }
     }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.area();
        r.display();
        Shape s = new Circle();
        s.area();
        Circle c = new Circle();
        c.area();
    }
}
