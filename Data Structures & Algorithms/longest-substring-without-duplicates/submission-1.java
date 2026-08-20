class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,right=0,maxLength=0;
        Set<Character> set = new HashSet();
        while(right<s.length())
        {
            while(!set.add(s.charAt(right)))
            {
                set.remove(s.charAt(left));
                left++;
            }
            maxLength = Math.max(maxLength, right-left+1);
            right++;
        }
        return maxLength;
    }
}
