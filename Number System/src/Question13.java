import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number");
        int Number=sc.nextInt();
        int quotient=Number/10;

        int remainder=Number%10;
        System.out.println(remainder);
        int mul=quotient*remainder;
        System.out.println(mul);
        int add=quotient+remainder;
        System.out.println(add) ;
        if(mul+add==Number){
            System.out.println("so "+Number+" is a special Number");

        }else {
            System.out.println("so "+Number+" is not a special Number");
        }

    }
}
