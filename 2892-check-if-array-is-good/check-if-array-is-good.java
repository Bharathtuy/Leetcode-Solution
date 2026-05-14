class Solution {
    public boolean isGood(int[] nums) {
        int cnt = 0;
        int max = 0;
        Arrays.sort(nums);
        for( int i = 0; i < nums.length ; i++){
            max = Math.max(max,nums[i]);
        }
        if(max == nums[0])cnt++;
        for( int i = 1 ; i < nums.length ; i++){
            if(nums[i]==nums[i-1] && nums[i]!=max){
                return false;
            }
            if ( nums[i] == max) cnt++;
        }
        if(cnt == 2 && max+1== nums.length)return true;
        return false;
    }
}