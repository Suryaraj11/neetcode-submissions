class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> anagram = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        List<String> keys = new ArrayList<>();
        for(int i = 0;i<strs.length;i++)
        {
            char[] s = strs[i].toCharArray();
            Arrays.sort(s);
            String p = new String(s);
            if(map.containsKey(p))
            {
                List<String> l = map.get(p);
                l.add(strs[i]);
                map.put(p,l);
            }
            else
            {
                List<String> l = new ArrayList<>();
                l.add(strs[i]);
                map.put(p,l);
                keys.add(p);
            }
        }
        for(int i = 0;i<map.size();i++)
        {
            anagram.add(map.get(keys.get(i)));
        }
        return anagram;
    }
}
