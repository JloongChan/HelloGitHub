package leetcode;

public class Solution_8 {

    public static void main(String[] args) {
        System.out.println(myAtoi("  0000000000012345678"));
    }

    public static int myAtoi(String str) {
        str = str.trim();
        boolean isFu = false;
        if (str.startsWith("+")) {
            str = str.substring(1);
        } else if (str.startsWith("-")) {
            str = str.substring(1);
            isFu = true;
        }
        while (str.startsWith("0")) {
            str = str.substring(1);
        }
        for (int i = 0; i < str.length(); i++) {
            char chars = str.charAt(i);
            if (!(chars>='0' &&  chars <= '9')) {
                str = str.substring(0, i);
                break;
            }
        }
        if (str.length() == 0) {
            return 0;
        }
        str = (isFu ? "-" : "") + str;
        long value = Long.parseLong(str.length() > 14 ? str.substring(0, 14) : str);
        if (value > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (value < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int)value;
    }

}