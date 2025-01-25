import java.util.Arrays;

public class A_RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};  // Original array with duplicates

        // Find the length of the array after removing duplicates
        int n = arr.length;
        if (n == 0 || n == 1) {
            System.out.println("Array without duplicates: " + Arrays.toString(arr));
            return;
        }

        // Sort the array to make duplicate elements adjacent
        Arrays.sort(arr);

        // Pointer for the last index of the unique array
        int j = 0;

        // Loop through the sorted array
        for (int i = 1; i < n; i++) {
            // If the current element is not equal to the last unique element, store it
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        // Copy the unique elements to a new array (optional step)
        int[] uniqueArray = Arrays.copyOfRange(arr, 0, j + 1);

        // Display the result
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArray));
    }
}
