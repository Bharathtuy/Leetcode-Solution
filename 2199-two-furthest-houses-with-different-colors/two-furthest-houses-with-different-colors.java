class Solution {
    public int maxDistance(int[] colors) {
        
        int st = 0 ;
        int ans = 0 ;
        for( int j = 0 ; j < colors.length ; j++){
            st = j;
        for ( int i =  colors.length-1 ; i >=0 ; i--){
            if ( colors[i]!= colors[st]){ ans = Math.max(ans,Math.abs(st-i));}
        }}
        return ans;
    }
}