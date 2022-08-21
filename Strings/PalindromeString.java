package Strings;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "abcba";
        palindrome(s);
        palindrome("abba");
        palindrome("abbccbba");
        palindrome("geeks");


//        if (isPalindrome("geeks"))
//
//            // It is a palindrome
//            System.out.print("Yes");
//        else
//
//            // Not a palindrome
//            System.out.print("No");
    }
    public static void palindrome(String s){
        char[] ch = s.toCharArray();
        int n = ch.length;
        boolean pal = false;
        for(int i = 0; i < ch.length/2; i++){
            if(ch[i] == ch[n-i-1]){
                pal = true;
            }
            else {
                pal = false;
                break;
            }
        }
        if(pal){
            System.out.println("palindrome");
        }
        else
            System.out.println("not palindrome");
    }

    static boolean isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
