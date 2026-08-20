class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backTrack(list,new ArrayList<>(),nums, 0);
        return list;
    }

    public void backTrack(List<List<Integer>> list, ArrayList<Integer> tempList, int[] nums, int start)
    {
        if (tempList.size() == nums.length) {
            list.add(new ArrayList<>(tempList));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(tempList.contains(nums[i]))continue;
            tempList.add(nums[i]);
            backTrack(list,tempList,nums,start+1);
            tempList.remove(tempList.size()-1);
        }
    }
}
