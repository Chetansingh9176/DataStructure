package Arrays.Sorting;

public class MergeSorting {
    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 1, 2, 5, 6, 11, 9, 10};
        int n = arr.length;
        mergeSort(arr);
        printArray(arr, n);
    }

    static void mergeSort(int[] inputArray) {
        int inputLength = inputArray.length;
        if (inputLength < 2) {
            return;
        }
        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];
        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArray[i];
        }
        for (int i = midIndex; i < inputLength; i++) {
            rightHalf[i - midIndex] = inputArray[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(inputArray, leftHalf, rightHalf);

    }

    static void merge(int[] arr, int[] leftArray, int[] rightArray) {
        int i = 0, j = 0, k = 0;
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] < rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
                k++;
            } else {
                arr[k] = rightArray[j];
                j++;
                k++;
            }
        }
        while (i < leftArray.length) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < rightArray.length) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    static void printArray(int[] arr, int n) {
        for (int i = 0; i <= n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
