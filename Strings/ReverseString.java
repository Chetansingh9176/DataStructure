package Strings;

public class ReverseString {
    public static void main(String[] args) {
        String s = "Chetan Singh";
        int[] arr = {1,2,3,4,5};
        reverseString(s);
    }

    static void reverseString(String s){
//        char ch;
//        String s_new ="";
//        for(int i =s.length()-1 ; i > 0;i--){
//            ch = s.charAt(i);
//            s_new = s_new+ch;
//        }
//        System.out.println(s_new);

        char[] ch = s.toCharArray();
        for(int i = ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        }
    }

}
