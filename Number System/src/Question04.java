import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side");
        double Side = sc.nextDouble();
        double area;
        area= Side * Side;
        System.out.println("Area of square is: "+area);
        double perimiter;
        perimiter =4 * Side;
        System.out.println("Preimter of Square is:"+perimiter);

    }
}