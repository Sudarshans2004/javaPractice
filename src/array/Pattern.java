package array;
//3. Print a 10x10 grid of dashes
//
//Write a Java program to print the following grid.

public class Pattern {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            for(int j =0;j<9;j++){
                if(j==0){
                    System.out.print(".");
                }
                System.out.print("_"+" ");
            }
            System.out.println(" ");
        }
    }
}
