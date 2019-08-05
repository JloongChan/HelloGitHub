package leetcode;

public class Solution_5 {

    public static void main(String[] args) {
        //System.out.println(longestPalindrome("eabcb"));
    }

    static StringBuilder result = null;

    public String longestPalindrome(String s) {
        if (s.length() == 0) {
            return "";
        }
        result = new StringBuilder(s.substring(0, 1));
        for (int i = s.length() - 1 ; i >= 1; i--) {
            loop(s, i);
            if (result.length() > 1) {
                break;
            }
        }
        return result.toString();
    }

    public void loop(String s, int length) {
        for (int i = 0; i < s.length() - length; i++) {
            if (isPalindrome(s, i, i + length)) {
                result = new StringBuilder(s.substring(i, i + length + 1));
                break;
            }
        }
    }

    public boolean isPalindrome(String x, int start, int end) {
        for (int i = 0; i <= (end - start) / 2; i++) {
            if (x.charAt(start + i) != x.charAt(end - i)) {
                return false;
            }
        }
        return true;
    }
}