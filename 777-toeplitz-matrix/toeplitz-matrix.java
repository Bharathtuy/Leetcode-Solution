class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        if (matrix.length == 1 || matrix[0].length == 1)
            return true;
        for (int i = 0; i < matrix[0].length; i++) {
            int j = 0;
            int t = matrix[j][i];
            while (i + j < matrix[0].length && j < matrix.length) {
                if (matrix[j][i + j] != t)
                    return false;
                j++;
            }
        }
        for (int i = 1; i < matrix.length; i++) {
            int j = 0;
            int t = matrix[i][j];
            while (i + j < matrix.length && j < matrix[0].length) {
                if (matrix[i + j][j] != t)
                    return false;
                j++;
            }
        }
        return true;
    }
}