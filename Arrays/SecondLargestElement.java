package Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {5, 1, 7, 8, 3, 9, 10, 13, 14,12, 14, 6,21,20};
//        printsecondLargest(arr);
        findSecond(arr);
    }

    static void printsecondLargest(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i =0 ; i<arr.length;i++){
            if(arr[i]>first){
                second = first;
                first = arr[i];
            }
            else if(arr[i] > second){
                second = arr[i];
            }
        }
        if(second == Integer.MIN_VALUE){
            System.out.println("-1");
        }
        else{
            System.out.println(second);
        }

    }


    public static void findSecond(int[] arr){
        int first = arr[0];
        int second = arr[0];
        for(int i =1 ; i< arr.length;i++){
            if(arr[i]>first){
                second = first;
                first = arr[i];
            }
            else
                second = arr[i];
        }

        System.out.println(second);
    }
}

