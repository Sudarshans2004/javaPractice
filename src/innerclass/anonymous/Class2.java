package innerclass.anonymous;

class Popcorn{
    void Taste (){
        System.out.println("caramel");
    }
}
public class Class2 {
    public static void main(String[] args) {
        Popcorn p = new Popcorn(){
            void Taste(){
                System.out.println("Salty");
            }
        };
        p.Taste();
        Popcorn p2 = new Popcorn();
        p2.Taste();
        Popcorn p3 = new Popcorn(){
          void Taste (){
              System.out.println("Spicy");
          }
        };
        p3.Taste();
    }
}
