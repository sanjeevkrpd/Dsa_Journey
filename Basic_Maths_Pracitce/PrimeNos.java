package Basic_Maths_Pracitce;

import java.util.Arrays;

public class PrimeNos {
    public static void main(String[] args) {

        int no = 100;
        int isPrime[] = new int[no + 1];
        Arrays.fill(isPrime, 1); 

        isPrime[0] = 0; // 0 is not prime
        isPrime[1] = 0; // 1 is not prime

        for (int i = 2; i * i <= no; i++) {
            if (isPrime[i] == 1) {
                for (int j = i * i; j <= no; j += i) {
                    isPrime[j] = 0; 
                }
            }
        }

        // Print all primes
        for (int i = 0; i < isPrime.length; i++) {
            if (isPrime[i] == 1) {
                System.out.print(i + ", ");
            }
        }
    }
}
