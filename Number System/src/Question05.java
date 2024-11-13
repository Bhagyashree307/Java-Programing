import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of pipe");
        double Length=sc.nextDouble();
        double cm,meter,foot;
        cm=1000;
        meter=cm/100;
        foot=cm/30.48;
        System.out.println("Length in meter:"+meter);
        System.out.println("Length in Foot"+foot);

    }
}
