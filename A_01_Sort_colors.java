public class A_01_Sort_colors {
    public static void main(String[] args) {
        int[] arr = {0,2,1,1,2,0,0,1,2};
        System.out.println("Original Array :");
        display(arr);

        sort_colors(arr);

        System.out.println("Sorted Array :");
        display(arr);
    }
    static void sort_colors(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length-1;

        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr,mid,low);
                low++;
                mid++;
            }
            else if(arr[mid] == 2){
                swap(arr,mid,high);
                high--;
            }
            else mid++;
        }
    }
    static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swap(int[] arr, int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
