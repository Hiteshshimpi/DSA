import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int sum=0;
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the number you want to check : ");
        int a =in.nextInt();
        while(a>0) {
            int td = a % 10;
            //System.out.println(td);
            int triple = td * td * td;
            a = a / 10; // get quotient
            sum += triple;
        }
        System.out.println(sum);
    }
}
