import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class InptLoop {
    public static void main(String []args){
       int sum=0;
        Scanner in = new Scanner(System.in);
        int input;
        while ((input = in.nextInt()) != 0){
            if (sum < input){
                 sum = input;
            }
        }
        //System.out.print("The largest number us  : "+ sum);
        System.out.print("The largest number us  : "+ sum);
    }
}
