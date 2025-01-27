import java.util.Arrays;
public class A_KthLargestElement {
    public static int findKthLargest(int[] nums, int k) {
        // Sort the array in ascending order
        Arrays.sort(nums);
        // Return the Kth largest element
        return nums[nums.length - k];
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println("The " + k + "th largest element is: " + findKthLargest(nums, k));
    }
}
