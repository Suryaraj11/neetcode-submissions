class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> map = new HashSet<Integer>();
        for(int val : nums)
        {
            if(map.contains(val))
            {
                return true;
            }
            else
            {
                map.add(val);
            }
        }
        return false;
    }
}