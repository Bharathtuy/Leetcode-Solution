class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int r_count = 0 ;
        int l_count = 0;
        for( int i = 0 ; i < moves.length();i++){
            if (moves.charAt(i)=='R')r_count++;
            if (moves.charAt(i)=='L')l_count++;
        }
        if ( r_count >= l_count )return moves.length()-2*l_count;
        else return moves.length()-2*r_count;
    }
}