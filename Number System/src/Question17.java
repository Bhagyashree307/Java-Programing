import java.util.Scanner;

public class Question17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month No");
        int MonthNo = sc.nextInt();
        if (MonthNo == 2) {

            System.out.println("Number of days is 28 or 29");
        } else if (MonthNo == 1 || MonthNo == 3 || MonthNo == 5 || MonthNo == 7 || MonthNo == 8 || MonthNo == 10 || MonthNo == 12) {
            System.out.println("Number of days is 31");
        } else {
            System.out.println("Number of days is 30");

        }

    }
}
