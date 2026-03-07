import java.util.Scanner;

public class VolumeCone {
    public static void main(String []args){
        Scanner in =new Scanner(System.in);
        float pie =3.14f;
        System.out.print("Enter the radius of Cone:  ");
        int radius = in.nextInt();
        int newRadius =(radius * radius);
        System.out.println(newRadius);
        System.out.print("Enter the height of Cone:  ");
        float  height =in.nextFloat();
         float newHeight = (height/3);
        System.out.println(newHeight);
         float Volume =(pie * newRadius) * newHeight;
        System.out.println(Volume1);
    }
}

