package Arrays.Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 1, 2, 5, 6, 11, 9, 10};
        int n = arr.length;
        selectionSort(arr, n);
        printArray(arr, n);
    }

    static void selectionSort(int[] arr, int n) {
        boolean isSwapped = true;
        while (isSwapped) {
            isSwapped = false;
            for (int i = 0; i < n - 1; i++) {
                int min = arr[i];
                if (arr[i + 1] < min) {
                    int temp = min;
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    isSwapped = true;
                }
            }
        }

    }

    static void printArray(int[] arr, int n) {
        for (int i = 0; i <= n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
