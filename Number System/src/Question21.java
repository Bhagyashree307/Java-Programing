import java.util.Scanner;

public class Question21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int Number=sc.nextInt();
        int count=0;
        for (int i=2; i<=Number;i++){
            for (int j=2;j<=i/2;j++){
                if (i%j==0){
                    count=1;
                    break;
                }
            }
            if (count==0){
                System.out.println(i);
            }
            count=0;
        }
    }

}
