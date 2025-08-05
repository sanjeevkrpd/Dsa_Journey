package Recursion;

public class PrintOneToN {

    public static void print1toN(int n){
        //base case

        if (n < 1) {
            return;
        }

        System.out.println(n);
        print1toN(n-1);

    }

    public static void main(String[] args) {
        print1toN(5);
    }
}
