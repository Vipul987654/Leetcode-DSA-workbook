class Solution 
{
    public int maxProfit(int[] A)
     {
        int min_buy= A[0];
      int  max_profit=0;
        for(int i= 0;i < A.length ; i++)
        {   
            min_buy=Math.min(min_buy,A[i]);
            int profit= A[i]-min_buy;
            max_profit=Math.max(max_profit,profit);
        }
        return max_profit;
    }
}