/**
 * Created by mong on 1/8/17.
 */
public class StringToInteger {
    public int myAtoi(String str) {
        if (str.length() == 0) return 0;
        while(str.charAt(0) == ' ') str = str.substring(1);
        while(str.charAt(str.length()-1) == ' ') str = str.substring(0, str.length()-1);
        char first = str.charAt(0);
        int sign = 1;
        if (first == '-') {
            sign = -1;
            str = str.substring(1);
            if (str.length() == 0) return 0;
        }
        else if (first == '+') str = str.substring(1);
        long result = 0;
        for (int i = 0; i < str.length(); i++) {
            int c = str.charAt(i) - '0';
            if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            else if (sign == -1 && result -1 > Integer.MAX_VALUE) return Integer.MIN_VALUE;
            else if(c < 0 || c > 9) return sign * (int) result;
            result = result * 10 + c;
        }
        return sign * (int) result;
    }
}