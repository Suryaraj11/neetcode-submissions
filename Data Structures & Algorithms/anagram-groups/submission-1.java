class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList();
        Map<String,List<String>> map = new HashMap();
        Set<String> keys = new HashSet();
        for(int i=0;i<strs.length;i++)
        {
            String s = strs[i];
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String tempStr = new String(temp);
            keys.add(tempStr);
            map.computeIfAbsent(tempStr, key -> new ArrayList<String>()).add(s);
        }
        for(String key : keys)
        {
            list.add(map.get(key));
        }
        return list;
    }
}
