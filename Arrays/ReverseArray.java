//Write a program to reverse an array or string
//complexity = O(n)

package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        revArray(arr, n);
        printArray(arr, n);
    }

    public static void revArray(int[] arr, int size) {
        int temp;
        int end = size - 1;
        for (int i = 0; i < size - 1; i++) {
            temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
            end = end - 1;
        }
    }

    public static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
