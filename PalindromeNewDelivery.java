public class PalindromeNewDelivery {
    public static void main(String [] args) {
        String str = "race";
        StringBuilder stringBuilder = new StringBuilder(str);
        int i =0;
        int j = str.length()-2;

        while(j>=0)
        {
            stringBuilder.append(str.charAt(j));
            j--;
        }
        System.out.println(stringBuilder.toString());

        int start =0;
        int last =stringBuilder.length()-1;
        int count=0;

        while(start < last)
        {
            if(stringBuilder.charAt(start)==stringBuilder.charAt(last));
            start++;
            last--;
            count++;
        }
        System.out.println(count);
    }


}
