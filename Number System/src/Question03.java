import java.util.Scanner;

public class Question03 {
    public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter Length");
            double Length=sc.nextDouble();
            System.out.println("Enter Breathe");
            double Breathe=sc.nextDouble();
            double area;
            area=Length * Breathe;
            System.out.println("Area of Reactangle is:"+area);
            double perimeter;
            perimeter= 2 * (Length+Breathe);
            System.out.println("perimeter of Rectangle is:"+perimeter);


    }
}
