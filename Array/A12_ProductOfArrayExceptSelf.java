package Array;

import java.util.Scanner;

public class A12_ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = new int[n];
        ans = productArray(arr);

        for (int ele : ans){
            System.out.print(ele+" ");
        }
    }
    public static int[] productArray(int[] nums){
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            output[i] = 1;
        }

        int left = 1;
        for (int i = 0; i < nums.length; i++) {
            output[i] *= left;
            left *= nums[i];
        }

        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] *= right;
            right *= nums[i];
        }

        return output;
    }
}
