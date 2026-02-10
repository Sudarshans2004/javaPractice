package constructor;

public class ThisKeyword1 {
    String name;
    int age ;
    ThisKeyword1(String name , int age){
//        with the help of this keyword we can access current instance variable
        this.age=age;
        this.name=name;
    }

    public static void main(String[] args) {
        ThisKeyword1 obj = new ThisKeyword1("Sudarshan",21);
        System.out.println(obj.age+"--"+ obj.name);
    }
}
