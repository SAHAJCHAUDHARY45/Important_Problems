public class A_MaximumSubArraySum {
    public static int findMaxSubarraySum(int[] nums) {
        int maxSoFar = Integer.MIN_VALUE; // Maximum sum found so far
        int currentMax = 0; // Maximum sum of the current subarray

        for (int num : nums) {
            // Include the current number in the subarray or start a new subarray
            currentMax = Math.max(num, currentMax + num);

            // Update the maximum sum found so far
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = findMaxSubarraySum(nums);
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}
