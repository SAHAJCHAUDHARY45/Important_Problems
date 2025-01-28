public class A_SubArrayWithGivenSum {
    public static int[] findSubarrayWithSum(int[] nums, int target) {
        int start = 0;
        int currentSum = 0;

        for (int end = 0; end < nums.length; end++) {
            // Add the current element to currentSum
            currentSum += nums[end];

            // Shrink the window from the left if currentSum exceeds the target
            while (currentSum > target && start <= end) {
                currentSum -= nums[start];
                start++;
            }

            // Check if currentSum equals the target
            if (currentSum == target) {
                return new int[]{start, end};
            }
        }

        // If no subarray is found, return an empty result
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 7, 5};
        int target = 12;

        int[] result = findSubarrayWithSum(nums, target);
        if (result[0] == -1) {
            System.out.println("No subarray found with the given sum.");
        } else {
            System.out.println("Subarray found from index " + result[0] + " to " + result[1]);
        }
    }
}
