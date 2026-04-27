class Solution {
    public int maxDifference(String s) {
        int maxodd = 0;
        int minodd = Integer.MAX_VALUE;
        int mineven = Integer.MAX_VALUE;
        int maxeven = 0 ;
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        int cnt = 1;
        for ( int i = 1 ; i< ch.length; i++){
            if (ch[i]==ch[i-1])cnt++;
            else{
            
            if ( cnt % 2 == 0){
                mineven = Math.min(mineven,cnt);
                maxeven = Math.max(maxeven,cnt);
            }
            else{
                minodd = Math.min(minodd,cnt);
                maxodd = Math.max(maxodd,cnt);
            }
                cnt = 1;
            }
        }
         if ( cnt!=0 && cnt % 2 == 0){
                mineven = Math.min(mineven,cnt);
                maxeven = Math.max(maxeven,cnt);
            }
            else{
                minodd = Math.min(minodd,cnt);
                maxodd = Math.max(maxodd,cnt);
            }

        return Math.max(maxodd-mineven , minodd-maxeven);
    }
}