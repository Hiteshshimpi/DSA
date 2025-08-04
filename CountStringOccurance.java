package DSA_2Pointers_Problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CountStringOccurance {
    public static void main(String[] args) {
        String str ="";
        char variable ='a';
        int count = countOccurance(str,variable);
        if(count>0)
        {
            System.out.println("Character : "+variable +"  is present in the given string and has count :"+count);
        }else
        {
            System.out.println("Character : "+variable +"  is not present in the given string");

        }
    }

    private static int countOccurance(String str, char variable) {
        int count_a=0;

        if(str.length()<0)
        {
            return 0;
        }
        for(int i =0;i<str.length();i++)
        {
            if(str.charAt(i)==variable)
            {
                count_a++;
            }
        }
      return  count_a;
    }

}