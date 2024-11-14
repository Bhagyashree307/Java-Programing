import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st No.");
        int No1=sc.nextInt();
        System.out.println("Enter 2nd No.");
        int No2=sc.nextInt();
        System.out.println("Enter 3rd No.");
        int No3=sc.nextInt();
        if (No1==No2 || No2==No3 || No1==No3) {
            System.out.println("Please enter distinct value ");
        }
        else if (No1>No2 && No2>No3){
            System.out.println(No2);
        } else if (No2>No1 && No1>No3){
            System.out.println(No1);
        }
        else {
            System.out.println(No3);
        }


    }
}
