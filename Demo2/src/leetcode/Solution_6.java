package leetcode;

public class Solution_6 {

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder[] sbArray = new StringBuilder[s.length() > numRows ? numRows : s.length()];
        for (int i = 0; i < sbArray.length; i++) {
            sbArray[i] = new StringBuilder();
        }
        boolean isPlus = false;
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            sbArray[index].append(s.charAt(i));
            // change index
            if (index == 0) {
                isPlus = true;
            } else if (index == sbArray.length - 1) {
                isPlus = false;
            }
            if (isPlus) {
                ++index;
            } else {
                --index;
            }
        }
        for (int i = 1; i < sbArray.length; i++) {
            sbArray[0].append(sbArray[i].toString());
        }
        return sbArray[0].toString();
    }
}