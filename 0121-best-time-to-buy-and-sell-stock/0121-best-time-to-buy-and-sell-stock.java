class Solution {
    public int maxProfit(int[] prices) {

        int min_value = Integer.MAX_VALUE;
        int profit =0;

        for(int i : prices){
            if(i<min_value){
                min_value=i;
            }
            else if(i-min_value>profit){
                profit=i-min_value;
            }
        }

        return profit;
    }
}