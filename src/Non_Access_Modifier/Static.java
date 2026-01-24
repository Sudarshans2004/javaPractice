package Non_Access_Modifier;

public  class Static {
//    public static class Static { we cannot make top class as static
    int y=10;   //Instance variable
    static int x =10;

   public static void main(String[] args) {
     Static s = new Static();
     s.x = 888;
     s.y=999;
     Static s1 = new Static();
       System.out.println(s1.x+"  --"+s1.y); //Here instance var is made for every new obj But in static one varible is declare at class level
}
}
