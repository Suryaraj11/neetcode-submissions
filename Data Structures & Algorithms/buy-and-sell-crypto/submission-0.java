class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0, left=0,right=0;
        while(right<prices.length)
        {
            if(prices[right]-prices[left]>=0)
            {
                maxProfit = Math.max(maxProfit,prices[right]-prices[left]);
            }
            else
            {
                left = right;
            }
            right++;
        }
        return maxProfit;
    }
}
