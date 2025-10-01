package Problems_on_Array.Medium_Questions;

public class Pascals_Triangle {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            int number = 1; 
        
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  "); 
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(number + "   "); 
                number = number * (i - j) / (j + 1); 
            }
            System.out.println(); 
        }
    }
}
