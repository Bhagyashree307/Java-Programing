import java.util.Scanner;

public class Question02 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Radius");
        double radius=sc.nextDouble();{
            double pi=3.14,area,Circumference;
            area = pi * radius * radius;
            System.out.println("area: "+area);
            Circumference=2 * pi *radius;
            System.out.println("Circumference:"+Circumference);
        }

    }
}
