package Array;

public class A09_MinMaxArray {
    public static void main(String[] args) {
        int[] nums = {2,1,4,7,5,3};

        MinMaxArray(nums);
    }
    public static int[] MinMaxArray(int[] arr){
        int[] ans = new int[2];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        ans[0] = max;
        ans[1] = min;
        System.out.println("Maximum : "+max);
        System.out.println("Minimum : "+min);

        return ans;
    }
}
