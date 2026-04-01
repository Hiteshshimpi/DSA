package CodingPractice;

public class MountainArray {
    // mountain array is an array where the elements are in increasing order and then decreasing order
    // find the peak element in the mountain array
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 4, 9};
        Boolean peak = findPeak(arr);
        System.out.println("Peak Element is: " + peak);
    }

    public static Boolean findPeak(int[] arr) {
        boolean peak = true;
        if (arr.length < 3) {
            return false;
        }
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i + 1] > arr[i]) {
                continue;
            } else if (arr[i + 1] < arr[i])
            {
                continue;
            }
            else
            {
                peak=false;
            }
        }
        return peak;

    }
    public boolean validMountainArray(int[] arr) {
        // 1st condition to check if length is greater than 3
        if(arr.length < 3)
        {
            return false;
        }
        int increase =0;
        int decrease = arr.length-1;
        while (increase + 1 < arr.length && arr[increase]< arr[increase+1])
        {
            increase++;
        }
        while(decrease - 1 > 0 && arr[decrease] < arr[decrease-1])
        {
            decrease--;
        }

        return increase ==decrease;
    }
}
