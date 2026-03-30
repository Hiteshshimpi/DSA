import java.util.Arrays;

public class RotateArrayByK {
    public static void main(String[] args){
        String[] strs = {"flower","flow","flight"};
        int k =8;
        int [] arr ={1,2,3,4,5,6,7,8};
         k = k % arr.length;
         if(k < 0){
            k = k + arr.length;
         }
          rotateArray(arr,0,k-1);
         rotateArray(arr,k, arr.length-1);
         rotateArray(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void rotateArray(int []arr,int start,int end){
        while(start < end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] =temp;
        start++;
        end--;
    }
    }

    static void commonPrefix(String[] strs){
        System.out.println("Common prefix is : "+strs[0]);

    }

}
