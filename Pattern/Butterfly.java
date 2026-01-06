package Pattern;

public class Butterfly {
    
    public static void main(String[] args) {
        

        int n = 5;

         for (int i = 1; i <= n; i++) {

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces
            int space = n - i;
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= (n - space); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces
            int space = n - i;
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= (n - space); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        }

    
}
