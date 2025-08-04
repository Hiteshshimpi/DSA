package DSA_2Pointers_Problems;

public class CountingValleys {
    public static void main(String[] args) {
        String path="DDUUDDUDUUUD";

        int level=0;
        int valley_count=0;
        for(int i=0;i<path.length();i++){
            if(path.charAt(i)=='U'){
                level++;
            }else if(path.charAt(i)=='D'){
                if(level==0){
                    valley_count++;
                }
                level--;
            }
        }
        System.out.println(valley_count);
    }
}
