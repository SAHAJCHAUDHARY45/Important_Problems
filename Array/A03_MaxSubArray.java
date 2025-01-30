package Array;
import java.util.*;
public class A03_MaxSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int ans = maxSubArraySum(nums);
        System.out.println("Maximum subarray sum is "+ans);
    }
    public static int maxSubArraySum(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int ele : arr){
            currentSum = Math.max(ele,currentSum+ele);
            maxSum = Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
}
