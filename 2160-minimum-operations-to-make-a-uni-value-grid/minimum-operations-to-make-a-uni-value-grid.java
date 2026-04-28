class Solution {
    public int minOperations(int[][] grid, int x) {
        List<Integer> t = new ArrayList<>();
        for( int i = 0 ; i < grid.length ; i++){
            for( int j = 0 ; j < grid[0].length ; j++){
                t.add(grid[i][j]);
            }
        }
        Collections.sort(t);
        int mid = t.size()/2;
        int ans = 0 ;
        for( int i = 0 ; i < t.size() ; i++){
            if ( i == mid)
                continue;

            int diff =Math.abs(t.get(i)-t.get(mid));
            if ( diff % x == 0 ){
                 ans+=diff/x;
            }
            else return -1;
            
        }
        return ans;
    }
}