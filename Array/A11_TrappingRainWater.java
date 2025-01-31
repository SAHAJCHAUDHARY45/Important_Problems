package Array;

import java.util.Scanner;

public class A11_TrappingRainWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = TrapWater(arr);
        System.out.println("Total Trap Water :"+ans);
    }
    public static int TrapWater(int[] arr){
        int left = 0;
        int right = arr.length-1;
        int leftMax = arr[left];
        int rightMax = arr[right];
        int water = 0;

        while (left < right){
            if (leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax, arr[left]);
                water += leftMax - arr[left];
            } else {
                right--;
                rightMax = Math.max(rightMax, arr[right]);
                water += rightMax - arr[right];
            }
        }
        return water;
    }
}
