package Non_Access_Modifier;

public class Static1 {
    int x =10;
    static int y= 20;
    public void m2(){
        System.out.println(x);
        System.out.println(y);
    }
     static public void m1(){
//         System.out.println(x); Here we cant access instance var in static method directly;
         System.out.println(y);
     }
}
