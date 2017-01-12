/**
 * Created by mong on 1/7/17.
 */
public class RotateImage {
    public void rotate(int[][] matrix) {
        for(int r = 0; r < matrix.length; r++){
            for(int c = r; c < matrix.length; c++){
                int temp = matrix[r][c];
                matrix[r][c] = matrix[c][r];
                matrix[c][r] = temp;
            }
        }
        for(int r = 0; r < matrix.length; r++){
            for(int c = 0; c < matrix.length / 2; c++){
                int temp = matrix[r][c];
                matrix[r][c] = matrix[r][matrix.length - c - 1];
                matrix[r][matrix.length - c - 1] = temp;
            }
        }
    }
}