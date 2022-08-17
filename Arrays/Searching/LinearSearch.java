package Arrays.Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 1, 2, 5, 6, 11, 9, 10};
        int ele = 9;
        linearSearch(arr, ele);
    }
    static void linearSearch(int[] arr, int ele){
        for(int i =0 ; i<arr.length;i++){
            if (arr[i] == ele){
                System.out.println("ele found at "+i+" index");
                break;
            }
        }
    }
}
