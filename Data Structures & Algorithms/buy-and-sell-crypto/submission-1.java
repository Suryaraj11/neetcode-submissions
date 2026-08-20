class Solution {
    public int maxProfit(int[] prices) {
        int left=0,right=0,maxVal=0;
        while(left<prices.length && right<prices.length)
        {
            while(prices[left]>prices[right])
            left++;
            maxVal = Math.max(maxVal,prices[right]-prices[left]);
            right++;
        }
        return maxVal;
    }
}
