import java.util.Arrays;
public class A_PairWithGivenSum {
    public static boolean findPairWithSum(int[] nums, int target) {
        // Sort the array
        Arrays.sort(nums);

        // Initialize two pointers
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            // Check if the pair matches the target
            if (sum == target) {
                System.out.println("Pair found: (" + nums[left] + ", " + nums[right] + ")");
                return true;
            }

            // Adjust pointers based on sum
            if (sum < target) {
                left++; // Increase the smaller value
            } else {
                right--; // Decrease the larger value
            }
        }

        System.out.println("No pair found with the given sum.");
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        findPairWithSum(nums, target);
    }
}
