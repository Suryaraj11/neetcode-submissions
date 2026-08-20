class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        Arrays.sort(nums);
        for(int num : nums)
        {
            map.put(num, map.getOrDefault(num,0)+1);
        }
        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            //System.out.println("key:"+entry.getKey()+" val:"+entry.getValue()+" t/f"+(entry.getValue()>=k));
             arr.add(new int[] {entry.getValue(), entry.getKey()});
        }

        arr.sort((a,b) -> b[0]-a[0]);
        //System.out.println(Arrays.toString(temp));
        int[] val = new int[k];
        for(int i=0;i<k;i++)
        {
            val[i]=arr.get(i)[1];

        }
        return val;
    }
}
