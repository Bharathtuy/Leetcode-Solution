class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        for(int i = 0 ; i < queries.length;i++){
            int st = queries[i][0];
            int end = queries[i][1];
            int incr = queries[i][2];
            int mul = queries[i][3];
            while(st<=end){
                long t = nums[st];
                nums[st]=(int)((t*mul)%1000000007);
                st+=incr;
            }
        }
        // if(nums.length==1)return nums[0];
        int ans = 0;
        for(int i = 0; i < nums.length;i++){
            ans^=nums[i];
        }
        return ans;
    }
}