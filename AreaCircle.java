import java.util.Locale;
import java.util.Scanner;

public class AreaCircle {
    public static void main(String []args){
        float pie =3.14f;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the parameter you want to select : \n 1. Radius \n 2. Diameter \n");
        String op = in.next().trim().toLowerCase();

        if (op.equals("radius")){
            System.out.print("Enter the Radius of Circle: ");
           int radius = in.nextInt();
           radius =(radius*radius);
            System.out.println(radius);
            float area =  (pie * (radius ));
            System.out.println(area);
        }
        if (op.equals("diameter")){
            System.out.print("Enter the diameter : ");
            int dia =in.nextInt();
            float area =  (pie * (dia * dia ));
            //area= area/4;
            area= area/4;
            System.out.println(area);
            System.out.print("Enter the Radius of Circle: ");
        }
    }
}
