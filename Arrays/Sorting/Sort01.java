package Arrays.Sorting;

public class Sort01 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 0, 1, 1, 0, 1};
        sortZeroOne(arr);
        printArray(arr);
    }

    static void sortZeroOne(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] == 0) {
                left++;
            } else if (arr[right] == 1) {
                right--;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

        }
    }

    static void printArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + ", ");
        }
    }
}
