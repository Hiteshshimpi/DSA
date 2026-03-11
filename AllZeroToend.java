import java.util.Arrays;

public class AllZeroToend {
    public static void main(String[] args) {
        int arr[] ={1,3,0,0,4,0,9};
        moveZeros(arr);
    }
    public static void moveZeros(int []arr){
        int cnt =0;
        for(int i =0;i<arr.length; i++)
            if(arr[i]!=0){
                arr[cnt]=arr[i];
                cnt++;
            }
        while(cnt<arr.length){
            arr[cnt]=0;
            cnt++;
        }
        System.out.println(Arrays.toString(arr1));
    }
}

