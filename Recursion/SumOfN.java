package Recursion;

public class SumOfN {

    public static int sumofN(int n , int sum){
        // base case
        if (n == 0) return sum;

        return sumofN(n-1 , n + sum );
    }
    public static void main(String[] args) {

        System.out.println(sumofN(5, 0));
    }
}
