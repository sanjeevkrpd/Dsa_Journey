package Recursion;

public class FactorialOfN {

    public static int fact(int n){

        if (n==1) {
            return 1;
        }
        return n * fact(n-1);

    }

    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(fact(5 , 1));
    }


    
    public static int fact(int n , int ans ){

        if (n==1) {
            return ans;
        }
        return  fact(n-1 , n * ans);

    }

}
