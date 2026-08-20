class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        boolean[] used = new boolean[s1.length()];
        return dfs(s1, s2, new StringBuilder(), used);
    }

    private boolean dfs(String s1, String s2,
                        StringBuilder temp, boolean[] used) {

        // base case: full permutation
        if (temp.length() == s1.length()) {
            return s2.contains(temp.toString());
        }

        for (int i = 0; i < s1.length(); i++) {
            if (used[i]) continue;

            used[i] = true;
            temp.append(s1.charAt(i));

            if (dfs(s1, s2, temp, used)) return true;

            // backtrack
            temp.deleteCharAt(temp.length() - 1);
            used[i] = false;
        }
        return false;
    }
}
