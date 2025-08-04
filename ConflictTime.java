package DSA_2Pointers_Problems;

import java.util.Arrays;

public class ConflictTime {
    public static void main(String[] args) {
        String[] event1 = {"01:15","02:00"};
        String [] event2 = {"02:00","03:00"};

        String[] parts1 = event1[0].split(":");
        System.out.println(Arrays.toString(parts1));
        /*double s1 = Double.parseDouble(parts1[0]);  // Convert "01" -> 1.0
        double e1 = Double.parseDouble(parts1[1]); // Convert "15" -> 15.0
        String[] parts2 = event2[0].split(":");
        double s2 = Double.parseDouble(parts2[0]);  // Convert "01" -> 1.0
        double e2 = Double.parseDouble(parts2[1]);*/

    }
}
