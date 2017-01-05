public class Pow {
    public static double myPow(double x, int n) {
        int sign = (int)Math.copySign(1, n);
        n= Math.abs(n);
        int bit = 0;
        double result = 1;
        while(n > 0){
            if(n % 2 == 1){
                double raisePower2 = x;
                for(int i = 0; i < bit; i++){
                    raisePower2 *= raisePower2;
                }
                result *= raisePower2;
            }
            n /= 2;
            bit++;
        }
        System.out.println(result);
        return sign == 1 ? result : 1.0 / result;
    }

    public static void main(String[] args){
        System.out.println(myPow(2.0000, -2147483648));
    }
}