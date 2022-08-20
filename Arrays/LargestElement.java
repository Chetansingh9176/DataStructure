package Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {5, 1, 7, 8, 3, 9, 10, 13, 14,12, 14, 6,21,20};
        findLargest(arr);
    }

    public static void findLargest(int[] arr){
        int largest = arr[0];
        for(int i=1 ; i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
