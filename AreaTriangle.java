import java.util.Scanner;

public class AreaTriangle {

    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of triangle:  ");
        float height =input.nextFloat();
        System.out.print("Enter the base :  ");
        float base=input.nextFloat();
        float area = (height * base)/2f;
        System.out.println("The area of Triangle is  : "+area);
    }

}
