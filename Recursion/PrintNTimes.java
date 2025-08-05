package Recursion;
public class PrintNTimes {

    public static void printNthTimes(int n , String name){

        if (n < 0 ) {
            return;
        }

        System.out.println(name);
        printNthTimes(n-1, name );

    }
    public static void main(String[] args) {
        
        printNthTimes(5 , "sanjeev");
    }
}
