import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Amount: ");
        double Amount=sc.nextDouble();
        System.out.println("Enter Interest rate:");
        double Interest=sc.nextDouble();
        System.out.println("Enter Time period");
        double Time=sc.nextDouble();
        double SI= Amount *(1+(Interest*Time)/100);
        System.out.println("Simple Interest is: "+SI);

    }
}
