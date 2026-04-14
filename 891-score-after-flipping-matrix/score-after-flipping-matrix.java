class Solution {
    public int matrixScore(int[][] grid) {
        String t ="";
        String t2="";

        for( int i = 0; i < grid.length ; i++){
            t="";
            t2="";
            int cnt = 0;
            for( int j = 0 ; j < grid[0].length ;j++){
                    t=t+Integer.toString(grid[i][j]);
            }
            for(int j = 0; j < grid[0].length;j++){
                if(grid[i][j]==1)
                t2=t2+"0";
                else
                t2=t2+"1";
            }

        
        int v1 = Integer.parseInt(t,2);
        int v2 = Integer.parseInt(t2,2);

        if( v1 < v2){
            for( int j = 0 ; j < grid[0].length ; j++){
                if(grid[i][j]==1)grid[i][j]=0;
                else
                grid[i][j]=1;
            }
        }
        }
         for( int i = 0  ; i < grid.length ; i++){
            // t = "";
            for( int j = 0 ; j < grid[0].length ; j++){
                // t=t+Integer.toString(grid[i][j]);
                System.out.print(grid[i][j]+" ");
            }
            // ans+=Integer.parseInt(t,2);

            System.out.println();
        }
         t="";
            t2="";
        for( int i = 0 ; i < grid[0].length;i++){
            t="";
            t2="";
            int cnt = 0;
            for( int j = grid.length-1 ; j >=0 ; j--){
                if(grid[j][i]==1)cnt++;
                // t+=Integer.toString(grid[j][i]);

            }
        //     for(int j = grid.length-1 ; j >=0 ; j--){
        //         if(grid[j][i]==1)
        //         t2=t2+"0";
        //         else
        //         t2=t2+"1";
        //     }
        //     int v1 = Integer.parseInt(t,2);
        // int v2 = Integer.parseInt(t2,2);

        if( cnt < grid.length-cnt){
            for( int j = 0 ; j < grid.length ; j++){
                if(grid[j][i]==1)grid[j][i]=0;
                else
                grid[j][i]=1;
            }
        }

        }
        int ans = 0;
        for( int i = 0  ; i < grid.length ; i++){
            t = "";
            for( int j = 0 ; j < grid[0].length ; j++){
                t=t+Integer.toString(grid[i][j]);
                System.out.print(grid[i][j]+" ");
            }
            ans+=Integer.parseInt(t,2);

            System.out.println();
        }
        return ans;
        
    }
}