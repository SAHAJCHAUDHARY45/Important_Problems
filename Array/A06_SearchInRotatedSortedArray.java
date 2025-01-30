package Array;

public class A06_SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {7,8,9,0,1,2,3};
        int target = 2;

        int ans = Search(nums,target);
        if(ans == -1){
            System.out.println("Target is not there in array.");
        }
        else {
            System.out.println("Target is there in array.");
        }

    }
    public static int Search(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
