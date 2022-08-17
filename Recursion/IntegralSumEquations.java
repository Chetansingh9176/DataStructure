package Recursion;

public class IntegralSumEquations {
    public static void main(String[] args) {
        int n = 5;
        int val = 1;
        int total = possibleSolution(n, val);
        System.out.println(total);
    }

    static int possibleSolution(int n , int val){
        int total = 0;
        if(n == 1 && val>=0){
            return 1;
        }
        for (int i =0 ; i <= val; i++){
            total = total + possibleSolution(n-1,val-i);
        }
        return total;
    }
}
