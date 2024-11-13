import java.util.Scanner;

public class Question01 {
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the name");
            String name=sc.nextLine();
            System.out.println("Enter the mobile number");
            long mobile=sc.nextLong();
            System.out.println("Enter 10th percentage");
            float percentage_10th=sc.nextFloat();
            System.out.println("Enter 12th percentage");
            float percentage_12th=sc.nextFloat();
            System.out.println("Enter Degree percentage");
            float percentage_degree=sc.nextFloat();

            System.out.println("Name: "+name);
            System.out.println("Mobile Number: "+mobile);
            System.out.println("10th: "+percentage_10th);
            System.out.println("12th: "+percentage_12th);
            System.out.println("Degree: "+percentage_degree);

        }
    }

