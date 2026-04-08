class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        k = k % mat[0].length;
        int temp[][] = new int[mat.length][mat[0].length];
        for(int i = 0 ; i< mat.length ; i++){
            for(int j = 0; j < mat[0].length;j++){
                temp[i][j]=mat[i][j];
                            }
        }
        int t = 0;
        while(k>0){
            for(int i = 0 ; i < mat.length ; i++){
                if(i%2==0){
                    t = mat[i][0];
                 for( int j = 0 ; j < mat[0].length-1 ; j++){
                    mat[i][j]=mat[i][j+1];
                    if(j==mat[0].length-2)
                    mat[i][j+1]=t;
                 }

                }
                else{
                    t = mat[i][mat[0].length-1];
                    for(int j = mat[0].length-1 ; j >=1 ; j--){
                        mat[i][j]=mat[i][j-1];
                        if(j==1)mat[i][0]=t;
                    }
                }
            }
            k--;
        }
        for(int i = 0 ; i < mat.length ; i++){
            for(int j =0 ; j < mat[0].length;j++){
                if(temp[i][j]!=mat[i][j])return false;
            }
        }
        return true;
    }
}