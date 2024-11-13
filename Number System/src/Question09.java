import java.util.Scanner;

public class Question09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Integer:");
        int first = sc.nextInt();
        System.out.println("Enter Second Integer:");
        int second = sc.nextInt();
        if (first > second) {
            System.out.println(first);
        } else {
            System.out.println(second);
        }
    }
}
