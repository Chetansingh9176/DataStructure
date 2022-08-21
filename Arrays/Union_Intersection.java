package Arrays;

import java.util.HashSet;
import java.util.Set;

public class Union_Intersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 7};
        int[] arr2 = {2, 3, 5, 6};
        findIntersection(arr1, arr2);
        findUnion(arr1, arr2);
    }
    static void findIntersection(int[] arr1, int[] arr2){
        int i =0, j=0;
        while(i<arr1.length && j<arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                System.out.print(arr2[j++] + " ");
                i++;
            }
        }
    }
    static void findUnion(int[] arr1, int[] arr2){
        int i = 0, j = 0;
        System.out.println();
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]) {
                System.out.print(arr1[i++]+" ");
            }
            else if(arr1[i]> arr2[j]){
                System.out.print(arr2[j++]+" ");
            }
            else{
                System.out.print(arr2[j++]+" ");
                i++;
            }

        }
        while(i<arr1.length){
            System.out.print(arr1[i++] + " ");
        }
        while(j<arr2.length){
            System.out.print(arr2[j++]+" ");
        }

    }
}
