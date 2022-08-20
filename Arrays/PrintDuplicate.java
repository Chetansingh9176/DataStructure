package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PrintDuplicate {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 2, 3, 4, 5, 6, 5};
        duplicate_betterSol(arr);
//        duplicate_worstSol(arr);
    }

    static void duplicate_betterSol(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        boolean dup = false;
        for (int n : arr) {
            if (map.containsKey(n)) {
                count = map.get(n);
                map.put(n, count + 1);
            } else
                map.put(n, 1);
        }

        for (Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
                dup = true;
            }
        }

        if (!dup) {
            System.out.println("-1");
        }

    }

    static void duplicate_worstSol(int[] arr){
        boolean dup = false;

        for(int i =0 ; i<arr.length-1;i++){
            for(int j = i+1; j<arr.length;j++){
                if(arr[i] == arr[j]){
                    System.out.print(arr[i]+" ");
                    dup = true;
                    break;
                }
            }
        }
        if(!dup)
            System.out.println("-1");
    }
}
