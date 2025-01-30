package Array;
import java.util.Arrays;
public class A04_ContainsDuplicate {
    public static void main(String[] args) {
        int[]  nums = {1,2,3,1};

        boolean ans = duplicate(nums);
        if (ans){
            System.out.println("Duplicates found!");
        }
        else{
            System.out.println("No Duplicates Found!");
        }
    }
    public static boolean duplicate(int[] arr){
        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i-1]){
                return true;
            }
        }
        return false;
    }
}
