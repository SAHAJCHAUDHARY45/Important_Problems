public class A_SecondLargestElement {
    public static int findSecondLargest(int[] nums) {
        if (nums.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > largest) {
                // Update second largest before updating largest
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second largest element found");
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] nums = {12, 35, 1, 10, 34, 1};
        try {
            System.out.println("The second largest element is: " + findSecondLargest(nums));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
