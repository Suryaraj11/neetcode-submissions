class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int contains = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                product *= nums[i];
            }
            else
            {
                contains++;
            }
        }
        if(contains > 1)return new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            if(contains==1)
            {
                nums[i]= nums[i]==0 ? product : 0;
            }
            else
            {
                nums[i]=product/nums[i];
            }
            
        }
        return nums;
    }
}  
