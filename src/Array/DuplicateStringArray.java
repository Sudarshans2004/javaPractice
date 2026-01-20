package Array;
//Write a Java program to find duplicate values in an array of string values.

public class DuplicateStringArray {
    public static void main(String[] args) {
        String[] str = {"Java", "Python", "Java", "C", "Python", "React"};
        for(int i=0;i<str.length;i++){
            for(int j=i+1;j<str.length;j++){
                if(str[i]==str[j]){
                    System.out.println(str[i]);
                }
            }
        }
    }
}
