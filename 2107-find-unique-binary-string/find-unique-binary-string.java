class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int it = 0;
        Arrays.sort(nums);
        for ( int i = 0 ; i < nums.length ; i++){
                   int tenp =  Integer.parseInt(nums[i],2);
                   if ( tenp != it){
                        return String.format("%" + nums[0].length() + "s", Integer.toBinaryString(it)).replace(' ', '0');
                   }
                   it++;

        }
        String ans = String.format("%" + nums[0].length() + "s", Integer.toBinaryString(it)).replace(' ', '0');
        return ans;
        
    }
}