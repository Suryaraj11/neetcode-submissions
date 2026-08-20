class Solution {
    public int maxArea(int[] heights) {
        int left=0,right=heights.length-1,maxVal=0;
        while(left<right)
        {
            maxVal=Math.max(maxVal, (right-left) * Math.min(heights[left],heights[right]));
            if(heights[left]<heights[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return maxVal;
    }
}
