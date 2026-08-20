class Solution {
    public boolean isPalindrome(String s) {
        int right=s.length()-1;
        for(int i=0;i<s.length();i++)
        {
            while(i<s.length() && !isAlphaNumerical(s.charAt(i)))
            {
                i++;
            }
            while(right>=0 && !isAlphaNumerical(s.charAt(right)))
            {
                right--;
            }
            if(i>=s.length() || right<0)break;
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(right)))return false;
            right--;
        }
        return true;
    }

    public boolean isAlphaNumerical(char c)
    {
        return ((c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9'));
    }
}
