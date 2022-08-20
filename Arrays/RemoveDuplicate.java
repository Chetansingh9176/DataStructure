package Arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 3, 4, 5, 6, 5};
        removeDuplicate(arr);
    }

    static void removeDuplicate(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        int count =0;
        for(int n : arr){
            if(map.containsKey(n)) {
                count = map.get(n);
                map.put(n, count + 1);
            }
            else
                map.put(n, 1);
        }
        Iterator<Map.Entry<Integer, Integer>> itr = map.entrySet().iterator();
        while(itr.hasNext()) {
            Map.Entry<Integer, Integer> entry = itr.next();
            if(entry.getValue()>1){
                itr.remove();
            }
            System.out.print(entry.getKey()+" ");
        }
    }
}
