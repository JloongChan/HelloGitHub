package leetcode;

public class Solution_6 {

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        String[][] strArr = new String[numRows][s.length()];
        boolean isPlus = false;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            strArr[start][i] = s.substring(i, i + 1);
            if (start == 0) {
                isPlus = true;
            } else if (start == numRows -1) {
                isPlus = false;
            }
            if (isPlus) {
                ++start;
            } else {
                --start;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (strArr[i][j] != null) {
                    sb.append(strArr[i][j]);
                }
            }
        }
        return sb.toString();
    }
}