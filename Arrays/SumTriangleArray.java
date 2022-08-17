package Arrays;

import java.util.Arrays;

public class SumTriangleArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        sumArray(arr);
    }

    static void sumArray(int[] arr) {
        if (arr.length == 0) {
            return;
        }
        int[] arr_new = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            arr_new[i] = arr[i] + arr[i + 1];
        }
        sumArray(arr_new);

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
