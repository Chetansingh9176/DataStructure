package Arrays;

public class MaxMinEle {

    public static void main(String[] args) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        find_MaxMin(arr);
    }
    static void find_MaxMin(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            else if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(max +", "+min);
    }
}
