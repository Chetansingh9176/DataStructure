package Arrays.Searching;

//Find first and last positions of an element in a sorted array
public class FindFirstnLast {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int x = 5;
//        findFirstnLastElement(arr, x);
        findFirstnLastElementBinary(arr, x);
    }

    static void findFirstnLastElement(int[] arr, int x) {
        int first = 0;
        int last = 0;
        int n = arr.length;
        for (int index = 0; index < n; index++) {
            if (arr[index] != x)
                continue;
            if (first == 0)
                first = index;
            last = index;
        }
        System.out.println(first + ", " + last);

    }

    static void findFirstnLastElementBinary(int[] arr, int ele) {
        int fo = first(arr, ele);
        int lo = last(arr, ele);
        System.out.println(fo);
        System.out.println(lo);
    }

    static int first(int[] arr, int ele) {
        int low = 0;
        int high = arr.length - 1;
        int res = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > ele) {
                high = mid - 1;
            } else if (arr[mid] < ele) {
                low = mid + 1;
            } else {
                res = mid;
                high = mid - 1;
            }
        }
        return res;
    }

    static int last(int[] arr, int ele) {
        int low = 0;
        int high = arr.length - 1;
        int res = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > ele) {
                high = mid - 1;
            } else if (arr[mid] < ele) {
                low = mid + 1;
            } else {
                res = mid;
                low = mid + 1;
            }
        }
        return res;
    }
}
