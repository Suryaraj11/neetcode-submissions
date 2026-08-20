class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        int[] alph = new int[26];
        for(int i=0;i<s.length();i++)
        {
            alph[s.charAt(i)-97]++;
            alph[t.charAt(i)-97]--;
        }
        for(int i=0;i<26;i++)
        if(alph[i]!=0)return false;
        return true;
    }
}
