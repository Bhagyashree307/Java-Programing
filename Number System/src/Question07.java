import java.util.Scanner;

public class Question07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int Number=sc.nextInt();

        if (Number >0) {
            System.out.println("Positive Number:"+Number);
        } else if (Number<0) {
            System.out.println("Negative Number:"+Number);

        } else {
            System.out.println("Zero:"+Number);

        }
    }
}
