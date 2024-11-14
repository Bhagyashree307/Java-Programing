import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height");
        double height=sc.nextDouble();
        System.out.println("Enter weigth");
        int weigth=sc.nextInt();
        double BMI= weigth/(height*height);
        System.out.println("BMI of person is:"+BMI);

    }
}
