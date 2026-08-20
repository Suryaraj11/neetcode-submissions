class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        char[] sString = s.toCharArray();
        char[] tString = t.toCharArray();
        Arrays.sort(sString);
        Arrays.sort(tString);
        for(int i=0;i<sString.length;i++)
        {
            if(sString[i]!=tString[i])
            return false;
        }
        return true;
    }
}
