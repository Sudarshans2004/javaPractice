package basicjavacodes;

public class NewtonSQRT {
    public static void main(String[] args) {
        int num = 36;
        System.out.println(isPerfectSquare(num));
    }
    public static double isPerfectSquare(int num) {
        double root =0.0;
        double x = (double)num;

        while(true){
            root=0.5*(x + (num/x));

            if(Math.abs(root-x)<1){
                break;
            }
        }

       return root;
    }
}
