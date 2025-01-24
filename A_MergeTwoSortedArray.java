public class A_MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] x = {1,3,4,7,8};
        int[] y = {2,6,9,10,11,14};

        int n = x.length + y.length;
        int[] ans = new int[n];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < x.length && j < y.length){
            if (x[i] < y[j]){
                ans[k] = x[i];
                i++;
            }
            else{
                ans[k] = y[j];
                j++;
            }
            k++;
        }
        if (i == x.length){    // Array x ended so now take element from y
            while(j < y.length){
                ans[k] = y[j];
                k++;
                j++;
            }
        }
        if (j == y.length){    // Array x ended so now take element from y
            while(i < x.length){
                ans[k] = x[i];
                k++;
                i++;
            }
        }
        display(ans);
    }
    static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
