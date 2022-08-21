package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindDuplicate {
    public static void main(String[] args) {
        String s ="geeks for Geeks";
        duplicate(s);
    }
    static void duplicate(String s){
        Map<Character, Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();
        int count =0;
        boolean dup = false;
        for(int i =0 ; i< ch.length;i++){
            if(map.containsKey(ch[i])){
                count = map.get(ch[i]);
                map.put(ch[i], count+1);
            }
            else{
                map.put(ch[i], 1);
            }
        }

    for(Entry<Character,Integer> entry : map.entrySet()){
        if(entry.getValue()>1 && entry.getKey()!=' '){
            dup = true;
            System.out.print(entry.getKey());
        }
    }

    if(!dup){
        System.out.println("no duplicate found");
    }

    }
}
