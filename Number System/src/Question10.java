import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Integer:");
        int first = sc.nextInt();
        System.out.println("Enter Second Integer:");
        int second = sc.nextInt();
        System.out.println("Enter Third Integer:");
        int third = sc.nextInt();
        if(first>second && first>third){
            System.out.println(first);
        } else if (second>third){
            System.out.println(second);
        } else {
            System.out.println(third);
        }
    }


}
