import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number");
        int First=sc.nextInt();
        System.out.println("Enter Second Number");
        int Second=sc.nextInt();
        System.out.println("Enter Third Number");
        int Third=sc.nextInt();
        if(First>Second && First>Third){
            System.out.println(First);
        } else if (Second>Third){
            System.out.println(Second);
        } else {
            System.out.println(Third);
    }
} }
