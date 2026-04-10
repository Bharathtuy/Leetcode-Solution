class Solution {
    public int minimumDistance(int[] nums) {
        int first = -1;
        int second = -1;
        int third = -1;
        int ans = 2147483647;
        if(nums.length <3)return -1;
        for(int i = 0 ; i < nums.length ; i++){
            first=i;
            second = -1;
            third=-1;
            for( int j = i+1;j< nums.length;j++){
                if(nums[i]==nums[j]){
                    if(second < 0){
                        second =j;
                    }
                    else if (third < 0){
                        third = j;
                        int val = Math.abs(first-second)+Math.abs(second-third)+Math.abs(third-first);
                        System.out.println(val);
                        ans = Math.min(val,ans);
                    }
                    else if(first>=0 && second>0 && third>0 ){
                        first=second;
                        second=third;
                        third=j;
                        int val = Math.abs(first-second)+Math.abs(second-third)+Math.abs(third-first);
                        ans = Math.min(val,ans);
                        System.out.println(val);
                    }
                }
            }
        }
        if( ans == 2147483647)return -1;
        
        return ans;

        
    }
}