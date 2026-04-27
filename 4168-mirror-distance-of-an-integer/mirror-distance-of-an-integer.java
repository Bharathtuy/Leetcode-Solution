class Solution {
    public int mirrorDistance(int n) {
        int dup = 0 ;
        int temp = n ;
         while ( n > 0 ){
            dup = dup * 10 + n%10;
            n = n / 10;
        }
        return Math.abs(temp-dup);
        
    }
}