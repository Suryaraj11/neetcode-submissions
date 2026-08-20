class Solution {
    public int maxProfit(int[] prices) {
        int left=0,right=0,maxVal=0;
        while(right<prices.length)
        {
            if(prices[right]-prices[left]>=0)
            maxVal = Math.max(maxVal,prices[right]-prices[left]);
            else
            left=right;
            right++;
        }
        return maxVal;
    }
}
