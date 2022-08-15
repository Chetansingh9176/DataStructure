package Arrays.Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 1, 2, 5, 6, 11, 9, 10};
        int n = arr.length;
        insertionSort(arr, n);
        printArray(arr, n);
    }

    static void insertionSort(int[] arr, int n) {
        for(int i = 1; i< n ; i++){
            int currentValue = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>currentValue){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] =currentValue;
        }
    }

    static void printArray(int[] arr, int n) {
        for (int i = 0; i <= n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
