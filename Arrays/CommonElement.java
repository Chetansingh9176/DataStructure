package Arrays;

import java.util.HashSet;
import java.util.Set;

public class CommonElement {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 6, 7, 8, 9};
//        getCommon_worstSol(arr1, arr2);
        getCommion_betterSol(arr1, arr2);
    }

    static void getCommon_worstSol(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                }
            }
        }
    }

    static void getCommion_betterSol(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int j = 0; j < arr2.length; j++) {
            if (set.contains(arr2[j])) {
                System.out.print(arr2[j] + " ");
            }
        }
    }
}
