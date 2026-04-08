class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long first_half = 0 ;
        long second_half = 0 ;
      
            for(int i = 0 ; i < grid.length;i++){
                for(int j = 0 ; j < grid[0].length;j++){
                    first_half+=grid[i][j];
                }
            }

            if(first_half%2!=0)return false;
            long req = first_half/2;
            for(int i = 0 ;i < grid.length-1;i++){
                for(int j = 0 ; j < grid[0].length ; j++){
                    second_half+=grid[i][j];
                }
                //  System.out.println(second_half);
                if(req==second_half)return true;
            }
            second_half=0;
            for(int i = 0 ; i  < grid[0].length-1 ; i++){
                for(int j= 0 ; j < grid.length;j++){
                    second_half+=grid[j][i];
                }
                if(req==second_half)return true;

            }
           
            
        
          
            // else return false;

        

     return false;   
    }
}