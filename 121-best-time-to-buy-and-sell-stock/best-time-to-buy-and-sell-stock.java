class Solution {
    public int maxProfit(int[] prices) {
         int min=prices[0];
         int r=0;
         for(int i=1;i<prices.length;i++)
         {
            if(prices[i]<min)  // here we are going to find minimum value
            {
                min=prices[i];
            }
            else if(prices[i]-min>r) // checking here maximum  profit 
            {
                r=prices[i]-min;
            }
         }
         return r;
    }
}