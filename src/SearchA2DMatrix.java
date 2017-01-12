import java.util.Arrays;

/**
 * Created by mong on 1/7/17.
 */
//should instead treat this 2D matrix as one sorted list
public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0) return false;
        int rows = matrix.length, cols = matrix[0].length;
        int lo = 0, mi, hi = matrix.length - 1;
        int targetRow = -1;
        while(lo <= hi){
            mi = (hi + lo) / 2;
            int lowerBound = matrix[mi][0];
            int upperBound = matrix[mi][cols - 1];
            if(lowerBound <= target && target <= upperBound){
                targetRow = mi;
                break;
            }
            else if(target < lowerBound){
                hi = mi - 1;
            }
            else{
                lo = mi + 1;
            }
        }

        if(targetRow == -1) return false;
        return Arrays.binarySearch(matrix[targetRow], target) >= 0;

    }
}