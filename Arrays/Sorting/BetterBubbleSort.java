package Arrays.Sorting;

public class BetterBubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 1, 2, 5, 6, 11, 9, 10};
        int n = arr.length;
        bubbleSort(arr, n);
        printArray(arr, n);
    }

    static void bubbleSort(int[] arr, int n) {
        boolean isSwapped = true;
        while (isSwapped) {
            isSwapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
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
