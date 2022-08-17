package Arrays.Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int ele = 9;
        int start = 0;
        int end = arr.length;
        binarySeacrh(arr, ele, start, end);
    }

    static void binarySeacrh(int[] arr, int ele, int start, int end) {
        int mid = start + (end - start) / 2;
        if (arr.length == 1) {
            System.out.println("ele is at zero index");
            return;
        }
        if (arr[mid] == ele) {
            System.out.println("ele is at " + mid + " index");
            return;
        } else if (arr[mid] > ele) {
            binarySeacrh(arr, ele, start, mid - 1);
        } else if (arr[mid] < ele) {
            binarySeacrh(arr, ele, mid + 1, end);
        }
    }
}
