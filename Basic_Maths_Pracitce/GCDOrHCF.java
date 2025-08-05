package Basic_Maths_Pracitce;
public class GCDOrHCF {
    public static void main(String[] args) {
        

        int a = 100;
        int b = 500;

        while (a > 0 && b >0) {

           if (a > b) {
            a = a % b; 
           }else{
            b =  b % a;
           }
        }
        
        if (a == 0) {
            System.out.println( "GCD OR HCF is :" + b);
        }else{
            System.out.println( "GCD OR HCF is :" + a);
        }
        
    }
}

//  tc O (log(min(a,b)))