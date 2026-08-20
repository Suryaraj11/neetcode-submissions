class Solution {
    public int maxArea(int[] heights) {
        int maxSum = 0, left=0,right=heights.length-1;
        while(left<right)
        {
            int area = Math.min(heights[left],heights[right])*(right-left);
            maxSum = Math.max(maxSum,area);
            if(heights[left] <= heights[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return maxSum;
    }
}
