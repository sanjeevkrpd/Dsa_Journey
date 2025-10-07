package Problems_on_Array.Easy_Questions;

    public class Buy_And_Sell_Stock {

    public  int maxProfit(int arr[]){


        int maxProfit = 0, minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int currPrice = arr[i];

            minPrice = Math.min(minPrice, currPrice);
            maxProfit = Math.max(maxProfit, currPrice-minPrice);
        
        }
        
        return maxProfit;
    }


    public static void main(String[] args) {
        

        int arr[] = {7,1,5,3,6,4};
        Buy_And_Sell_Stock b = new Buy_And_Sell_Stock();

        System.out.println(b.maxProfit(arr));
    }
}
