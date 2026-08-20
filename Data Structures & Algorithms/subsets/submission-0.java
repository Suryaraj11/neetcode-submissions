class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backTrack(list, new ArrayList<Integer>(),nums,0);
        return list;
    }
    public void backTrack(List<List<Integer>> list, ArrayList<Integer> tempList,int[] nums, int start)
    {
        list.add(new ArrayList<>(tempList));
        for(int i=start;i<nums.length;i++)
        {
            tempList.add(nums[i]);
            backTrack(list, tempList,nums,i+1);
            tempList.remove(tempList.size()-1);
        }
    }
}
