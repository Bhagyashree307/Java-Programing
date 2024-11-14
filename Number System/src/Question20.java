import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Integer");
        int integer= sc.nextInt();
        int num1=0,num2=1;
        while (num1 <=integer){
            int num3 = num1 + num2;
            System.out.print(" " + num1);
            num1 = num2;
            num2 = num3;

        }



    }
}
