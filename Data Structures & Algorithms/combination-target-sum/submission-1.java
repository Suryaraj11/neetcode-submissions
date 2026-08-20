class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        backTrack(list, new ArrayList<>(),nums,target,0,0);
        return list;
    }

    public void backTrack(List<List<Integer>> list, ArrayList<Integer> tempList,int[] nums, int target, int sum, int start)
    {
        if(sum==target)
        {
            list.add(new ArrayList<>(tempList));
            return;
        }
        if(sum > target) return;
        for(int i=start;i<nums.length;i++)
        {
            sum+=nums[i];
            tempList.add(nums[i]);
            backTrack(list, tempList,nums,target,sum, i);
            sum-=tempList.get(tempList.size()-1);
            tempList.remove(tempList.size()-1);
        }
    }
}