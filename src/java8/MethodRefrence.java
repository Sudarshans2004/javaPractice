package java8;

public class MethodRefrence {

    public static void main(String[] args) {

        // Lambda expression
        Sum lambda = (a, b) -> a + b;

        int sum1 = lambda.sum(50, 50);
        System.out.println(sum1);

        // Calling normal method
        int ans = addition(10, 20);
        System.out.println(ans);

        // Method Reference
//        Sum isum = MethodRefrence::addition;
        Sum isum = Integer::sum;

        int sum2 = isum.sum(1000, 2000);
        System.out.println("Method refrence way " +sum2);
    }

    public static int addition(int c, int d) {
        return c + d;
    }
}