class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> numbIndex = new HashMap<>();
        for(int i =0;i<nums.length;i++)
        { 
            if(numbIndex.containsKey(target-nums[i]))
            {
                return new int[] {numbIndex.get(target-nums[i]), i};
            }
            else
            {
                numbIndex.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}