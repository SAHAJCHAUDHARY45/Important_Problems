package Array;

public class A09_MinMaxArray {
    public static void main(String[] args) {
        int[] nums = {2,1,4,7,5,3};

        MinMaxArray(nums);
    }
    public static int[] MinMaxArray(int[] arr){
        int[] ans = new int[2];

        ans[0] = Integer.MAX_VALUE;
        ans[1] = Integer.MIN_VALUE;

        for (int ele : arr) {
            if(ele > ans[1]) ans[1] = ele;
            if (ele < ans[0]) ans[0] = ele;
        }

        System.out.println("Maximum : "+ans[1]);
        System.out.println("Minimum : "+ans[0]);

        return ans;
    }
}
