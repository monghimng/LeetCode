public class ValidSudoku {
    public double myPow(double x, int n) {
        if(n < 0){
            x = 1 / x;
        }
        double result = 1;
        if(n == Integer.MIN_VALUE){
            result = x;
            n = Integer.MIN_VALUE + 1;
        }
        n = Math.abs(n);
        while(n > 0){
            if(n % 2 == 1){
                result *= x;
            }
            x *= x;
            n /= 2;
        }

        return result;
    }
}