/**
 * Created by mong on 1/11/17.
 */
public class Sqrt {
        public int mySqrt(int x) {
        int lo = 0, hi = x;
        while(lo <= hi){
            int mi = (lo + hi) / 2;
            long test = 1L * mi * mi;
            if(test == x) return mi;
            else if(test > x) hi = mi -1;
            else lo = mi + 1;
        }
        while(hi * hi > x) hi--;
        return hi;
    }
}