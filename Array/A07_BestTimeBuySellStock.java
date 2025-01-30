package Array;

public class A07_BestTimeBuySellStock {
    public static void main(String[] args) {
        int[] prices = {5,2,4,8,1,3};

        int ans = maxProfit(prices);
        System.out.println("Maximum profit is :"+ ans);
    }
    public static int maxProfit(int[] arr){
        int buy = arr[0];
        int profit = 0;

        for (int i = 1; i < arr.length; i++) {
            if (buy > arr[i]){
                buy = arr[i];
            } else if ((arr[i] - buy) > profit) {
                profit = arr[i] - buy;
            }
        }
        return profit;
    }
}
