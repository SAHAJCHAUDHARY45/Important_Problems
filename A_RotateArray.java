import java.util.Arrays;
public class A_RotateArray {
    public static void main(String[] args) {
        // Sample array and rotation steps
        int[] array = {1, 2, 3, 4, 5};
        int k = 2; // Number of steps to rotate

        System.out.println("Original Array: " + Arrays.toString(array));

        rotateArray(array, k);

        System.out.println("Rotated Array: " + Arrays.toString(array));
    }

    public static void rotateArray(int[] array, int k) {
        int n = array.length;
        k = k % n; // Handle cases where k is greater than the array length

        // Reverse the entire array
        reverse(array, 0, n - 1);

        // Reverse the first k elements
        reverse(array, 0, k - 1);

        // Reverse the remaining elements
        reverse(array, k, n - 1);
    }

    public static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
