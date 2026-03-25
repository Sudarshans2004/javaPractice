package innerclass.regularinner;

public class InnerClassFromInstance {
      class inner {
          public  void display(){
              System.out.println("Display");
          }
      }
      public void m10 (){
          inner i = new inner();
          i.display();
      }

    public static void main(String[] args) {
        InnerClassFromInstance i = new InnerClassFromInstance();
        i.m10();
    }
}
