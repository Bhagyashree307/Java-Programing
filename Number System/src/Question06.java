import java.util.Scanner;

public class Question06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        double a=sc.nextDouble();
        System.out.println("Enter b");
        double b=sc.nextDouble();

        double add=a+b;
        double sub=a-b;
        int mul=(int)(a*b);
        double div=a/b;
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);



    }
}
