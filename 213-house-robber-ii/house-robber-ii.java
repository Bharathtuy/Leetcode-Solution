class Solution {
    public int find(int n[] , int dp[] , int i){
        if( i == 1  )return n[1];
        if ( i < 1 )return 0 ;
        if(dp[i]!=-1)return dp[i];
        return dp[i]=Math.max(n[i]+find(n,dp,i-2),find(n,dp,i-1));
    }
    public int find2(int n[] , int dp[] , int i){
        if( i == 0  )return n[0];
        if ( i < 0 )return 0 ;
        if(dp[i]!=-1)return dp[i];
        return dp[i]=Math.max(n[i]+find2(n,dp,i-2),find2(n,dp,i-1));
    }

    public int rob(int[] nums) {
        if( nums.length == 1)return nums[0];
        int[]dp = new int [nums.length];
        Arrays.fill(dp,-1);
        int[]dp2 = new int [nums.length];
        Arrays.fill(dp2,-1);
        return Math.max(find(nums,dp,nums.length-1),find2(nums,dp2,nums.length-2));
        
    }
}