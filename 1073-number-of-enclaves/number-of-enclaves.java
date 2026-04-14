class Solution {
    public void make_zero(int[][] grid,int i , int j){
        if(grid[i][j]==1)grid[i][j]=0;
        else return ;
        if(i+1 < grid.length){
            make_zero(grid,i+1,j);
        }
        if(i-1 >=0){
            make_zero(grid,i-1,j);
        }
        if(j+1<grid[0].length){
            make_zero(grid,i,j+1);
        
        }
        if(j-1>=0){
            make_zero(grid,i,j-1);
        }
    }
    public int numEnclaves(int[][] grid) {

        for(int i = 0 ; i < grid.length ; i++){
            for( int j = 0 ; j < grid[0].length ; j++){
                if( i == 0 || j == 0 || i == grid.length-1 || j == grid[0].length-1 )
                if(grid[i][j]==1)make_zero(grid,i,j);
            }
        }
        int ans = 0;
        for( int i = 0 ; i < grid.length ; i++){
            for( int j = 0; j < grid[0].length ; j++){
                if(grid[i][j] == 1)ans++;
                // System.out.print(grid[i][j]+" ");
            }
            // System.out.println();
        }
        return ans;
        
    }
}