public class ReverseInteger {


    public int reverse(int x) {
        int sign = (int)Math.copySign(1, x);
        x = Math.abs(x);
        int result = 0;
        while(x > 0){
            System.out.println(result);
            for(int i = 1; i <= 10; i++) if(Integer.MAX_VALUE - i * result - x % 10 < 0) return 0;
            result = result * 10 + x % 10;
            x /= 10;
        }
        return sign * result;
    }
//
//    public int reverse(int x) {
//        String s = new StringBuilder(""+x).reverse()+"";
//        if(s.length() > 10 || s.length() == 10 && )
//    }

}