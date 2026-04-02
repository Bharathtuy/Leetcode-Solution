class Solution {
    public void transpose(int [][] mat)
    {
        for( int i = 0 ; i < mat.length ;i++){
            for( int j = i ; j < mat[0].length ;j++){
                int temp = mat[i][j];
                mat[i][j]= mat[j][i];
                mat[j][i]=temp;
            }
        }
    }
    public void reverse( int [][] mat){
        for( int i = 0 ; i < mat.length ; i++){
            for( int j = 0 ; j < mat[0].length/2 ;j++){
                int t = mat[i][j];
                mat[i][j]=mat[i][mat.length-1-j];
                mat[i][mat.length-1-j]=t;
            }
        }
    }
    public boolean isEqual(int [][]mat, int[][]tar){
        for(int i = 0 ; i < mat.length;i++){
            for(int j = 0 ;  j < mat[0].length ;j++){
                if(mat[i][j]!=tar[i][j])return false;
            }
        }
        return true;
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        for( int i = 0 ; i < 4 ; i++){
            if(isEqual(mat,target))
            return true;
            transpose(mat);
            reverse(mat);
        }
        return false;
        
    }
}