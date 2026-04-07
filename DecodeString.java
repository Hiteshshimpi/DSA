public class DecodeString {
    public static void main(String args[]) {
        String s = "d3m4t2b0a1";
        StringBuilder strB = new StringBuilder();
        int i = 0;
        int j = 1;

        while (i < s.length() && j < s.length()) {
            if (Character.isDigit(s.charAt(j))) {
                int count = s.charAt(j) - '0';
                while (count > 0) {
                    strB.append(s.charAt(i));
                    count--;
                }

            }
            i++;
            j++;
            System.out.println(strB.toString());
        }
    }
}
