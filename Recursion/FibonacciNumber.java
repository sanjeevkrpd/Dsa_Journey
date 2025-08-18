package Recursion;

public class FibonacciNumber {

    public static int calcFibo(int no){

        if (no == 0 || no == 1) {
            return no;
        }

        return calcFibo(no-1) + calcFibo(no-2);
    }

    public static void main(String[] args) {
        
        System.out.println("Fibonacci of : "+5 + calcFibo(5));

    }
}
