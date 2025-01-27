public class A_FindMissingNumber {
    public static int findMissingNumber(int[] nums, int n) {
        // Calculate the expected sum of numbers from 1 to n
        int expectedSum = n * (n + 1) / 2;

        // Calculate the actual sum of elements in the array
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }

        // The missing number is the difference between expectedSum and actualSum
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 6, 3, 7, 8}; // Array of size n-1
        int n = 8; // Total numbers from 1 to n

        int missingNumber = findMissingNumber(nums, n);
        System.out.println("The missing number is: " + missingNumber);
    }
}
