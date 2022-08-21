package Arrays;

public class MoveNegative {
    public static void main(String[] args) {
        int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        moveNegativeToLeft(arr);
        printArray(arr);
    }

    static void moveNegativeToLeft(int[] arr){
        int low =0;
        int mid =0;
        int temp=0;
        while(arr[mid]<arr.length){
            if(arr[mid]<0){
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            mid++;
        }
    }

    static void printArray(int[] arr){
        for(int n : arr)
            System.out.print(n + " ");
    }
}
