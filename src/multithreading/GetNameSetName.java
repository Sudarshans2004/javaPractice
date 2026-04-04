package multithreading;

public class GetNameSetName {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Sudarshan");
        System.out.println(Thread.currentThread().getName());

    }
}
