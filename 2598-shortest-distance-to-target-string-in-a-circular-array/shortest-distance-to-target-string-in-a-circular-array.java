class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int ans = -1;
        int in = startIndex;
        while(true){
            if(words[in%words.length].equals(target)){
                ans = in-startIndex;
                break;
            }
            if ( in > startIndex+words.length)break;
        in++;    
        }
        if(ans==-1)return -1;
        in = startIndex;
        while(true){
            if(words[(in+words.length)%words.length].equals(target)){
                ans = Math.min(ans,startIndex-in);
                break;
            }
            // if(ans == -1)break;
            in--;
        }
        return ans;
    }
}