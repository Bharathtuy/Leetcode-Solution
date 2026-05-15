class Solution {
    public int findMin(int[] nums) {
        int l =0;
        int e = nums.length-1;
        while( l <= e ){
            int m = (l+e) / 2;
            if ( nums[m] > nums[nums.length-1] )
            l = m +1;
            else
            e = m - 1;
        }
return nums[e+1];
    }
}