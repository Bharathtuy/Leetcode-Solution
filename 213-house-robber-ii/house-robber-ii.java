class Solution {
    // int dp[];
    public int robb(int []nums,int i,int dp[]){
      if(i==0)return nums[0];
      if( i< 0) return 0;
      if(dp[i]!=-1)return dp[i];
      int c = nums[i]+robb(nums,i-2,dp);
      int nc = 0 + robb(nums ,i-1,dp);
      return dp[i]=Math.max(c,nc);

    }
    public int rob(int[] nums) {
        if(nums.length==1)
        return nums[0];
       int  dp[] = new int[nums.length+1];
        Arrays.fill(dp,-1);
        int ans =  robb(nums,nums.length-2,dp);
        int nums2[] = new int [nums.length-1];
        for( int  i = 1; i< nums.length; i++)
        nums2[i-1]=nums[i];
        Arrays.fill(dp,-1);
        int ans2 =robb(nums2,nums2.length-1,dp);
        return Math.max(ans,ans2);

    }
}