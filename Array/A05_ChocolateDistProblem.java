package Array;
import java.util.*;
public class A05_ChocolateDistProblem {
    public static void main(String[] args) {
        ArrayList<Integer> chocolates = new ArrayList<>();
        Collections.addAll(chocolates, 12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50);

        int m = 7; // Number of students

        int minDifference = chocolateDistribution(chocolates, m);

        if (minDifference != -1) {
            System.out.println("Minimum difference is: " + minDifference);
        }
    }
    public static int chocolateDistribution(ArrayList<Integer> arr,int m){
        int n = arr.size();  // size of ArrayList
        Collections.sort(arr);

        if (m == 0 || n == 0){
            return 0;
        }
        if (m > n){
            System.out.println("Not enough packets ");    // Number of students are more than packets.
            return -1;
        }

        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i+m-1< n; i++) {
            int diff = arr.get(i+m-1) - arr.get(i);
            minDiff = Math.min(diff,minDiff);
        }
        return minDiff;
    }
}
