package solved.p_10_backtracking.nc077_M_07_131_Palindrome_Partitioning;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    List<List<String>> result = new ArrayList<>();

    public List<List<String>> partition(String s) {
        List<String> currList = new ArrayList<>();
        dfs(0, s, currList);
        return result;
    }

    private void dfs(int start, String s, List<String> currList) {
        if (s.length() - 1 < start) {
            result.add(new ArrayList<>(currList));
            return;
        }
        for (int end = start; end < s.length(); end++) {
            if (isPalindrome(start, end, s)) {
                currList.add(s.substring(start, end + 1));
                dfs(end + 1, s, currList);
                currList.remove(currList.size() - 1);
            }
        }
    }

    private boolean isPalindrome(int l, int r, String s) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
