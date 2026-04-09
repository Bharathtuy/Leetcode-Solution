class Solution {
    int ans= 0;
    public void find(int []nums,int t , int v , boolean s,int cur){
        if( cur == nums.length){
            if(v==t)
            ans++;
            return ;
        }
        // for( int i = cur ; i< nums.length ;i++){
            
            find(nums,t,v-nums[cur],s,cur+1);
                // s=false;

            find(nums,t,v+nums[cur],s,cur+1);}

        // }
    
    public int findTargetSumWays(int[] nums, int target) {
        find(nums,target,0,false,0);
        return ans;
    }
}