import java.util.ArrayList;
import java.util.List;

/**
 * Created by mong on 1/9/17.
 */
public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ret =  new ArrayList<>();
        if(matrix.length == 0 || matrix[0].length == 0) return ret;
        int r = 0;
        int c = 0;
        int m = matrix.length - 1;
        int n = matrix[0].length -1;

        while(m>=r && n>=c){
            //top
            for(int i = c; i <= n; i++){
                ret.add(matrix[r][i]);
            }
            //right
            for(int i = r + 1; i <= m; i++){
                ret.add(matrix[i][n]);
            }
            //bottom
            if(m != r){
                for(int i = n - 1; i > c; i--){
                    ret.add(matrix[m][i]);
                }
            }
            //left
            if(c != n){
                for(int i = m; i > r; i--){
                    ret.add(matrix[i][c]);
                }
            }
            r++;
            c++;
            m--;
            n--;
        }
        return ret;
    }
}