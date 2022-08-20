package Arrays;

public class ThirdLargestElement {
    public static void main(String[] args) {
        int[] arr = {5, 1, 7, 8, 3, 19,9, 10, 13, 14,12, 14, 6,21,20};
        findThirdLargest(arr);
    }
    public static void findThirdLargest(int[] arr){
        int first=arr[0];
        int second= arr[0];
        int third = arr[0];

        for(int i = 1; i<arr.length;i++){
            if(arr[i]> first){
                third = second;
                second = first;
                first = arr[i];
            }
            else if (arr[i]> second){
                third = second;
                second= arr[i];
            }
            else{
                third = arr[i];
            }
        }
        System.out.println(third);
    }
}
