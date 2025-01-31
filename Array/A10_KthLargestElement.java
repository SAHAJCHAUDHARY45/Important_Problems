package Array;
import java.util.Arrays;
import java.util.Scanner;

public class A10_KthLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter K:");
        int k = sc.nextInt();

        if (k > n || k <= 0) {
            System.out.println("Invalid K value! K should be between 1 and " + n);
        } else {
            int ans = KthLargest(arr, k);
            System.out.println("Kth Largest Element in the array: " + ans);
        }

        sc.close();
    }

    public static int KthLargest(int[] arr, int k) {
        Arrays.sort(arr); // Sort the array in ascending order
        return arr[arr.length - k]; // Get the Kth largest element
    }
}
