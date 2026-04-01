package CodingPractice;

public class LowerAndUpperCase {
    public static void main(String[] args) {
        String str = "AabBCcDefGHIjK";
        int lower = 0;
        int upper = 0;
        for( int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch))
            {
                lower++;
            }
            else if(Character.isUpperCase(ch))
            {
                upper++;
            }
        }
        System.out.println(lower+" and "+upper);
    }

}
