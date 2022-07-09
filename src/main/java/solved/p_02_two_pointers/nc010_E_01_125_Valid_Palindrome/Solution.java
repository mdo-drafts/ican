package solved.p_02_two_pointers.nc010_E_01_125_Valid_Palindrome;

public class Solution {

    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char lChar = s.charAt(left);
            if (!Character.isAlphabetic(lChar) && !Character.isDigit(lChar)) {
                left++;
                continue;
            }
            char rChar = s.charAt(right);
            //TODO: Character.isLetterOrDigit !!!
            if (!Character.isAlphabetic(rChar) && !Character.isDigit(rChar)) {
                right--;
                continue;
            }
            if (Character.toLowerCase(lChar) != Character.toLowerCase(rChar)) return false;
            left++;
            right--;
        }
        return true;
    }

}
