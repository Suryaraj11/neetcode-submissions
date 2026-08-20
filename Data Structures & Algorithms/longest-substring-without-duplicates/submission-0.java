class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0,left = 0, right = 0;
        Set<Character> set = new HashSet();
        for(int i=0;i<s.length();i++)
        {
            while(!(set.add(s.charAt(i))))
            {
                set.remove(s.charAt(left));
                left++;
            }
            longest = Math.max(longest,i-left +1);
        }
        return longest;
    }
}
