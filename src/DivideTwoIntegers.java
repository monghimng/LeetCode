/**
 * Created by mong on 1/7/17.
 */
public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if(divisor == 0 || dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
        int sign = (int)(Math.copySign(1, dividend) * Math.copySign(1, divisor));
        long dvd = Math.abs((long)dividend), dvs = Math.abs((long)divisor);
        int quotient = 0;

        while(dvd >= dvs){
            long multiple = 1;
            long x = dvs;
            while(x << 1 <= dvd){
                x <<= 1;
                multiple <<= 1;
            }
            dvd -= x;
            quotient += multiple;
        }
        return (sign == -1 ? -quotient : quotient);
    }
}