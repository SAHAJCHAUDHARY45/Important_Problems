package Array;

public class A08_RepeatingMissingNumber {
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};
        RepeatMissNumber(arr);
    }
    public static void RepeatMissNumber(int[] arr){
        int n = arr.length;
        long sumN = (long) n * (n + 1) / 2;
        long sumSqN = (long) n * (n + 1) * (2 * n + 1) / 6;

        long sumA = 0, sumSqA = 0;
        for (int num : arr) {
            sumA += num;
            sumSqA += (long) num * num;
        }

        // Equations:
        long diff1 = sumA - sumN;  // x - y
        long diff2 = sumSqA - sumSqN;  // x² - y²

        // Solve for x and y (Repeating and Missing)
        long sumXY = diff2 / diff1;
        int repeating = (int) ((sumXY + diff1) / 2);
        int missing = (int) (sumXY - repeating);

        System.out.println("Repeating Number: " + repeating);
        System.out.println("Missing Number: " + missing);
    }
}
