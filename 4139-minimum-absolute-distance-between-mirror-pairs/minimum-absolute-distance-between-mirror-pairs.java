class Solution {
    public int minMirrorPairDistance(int[] nums) {
     int ans = Integer.MAX_VALUE;
     HashMap<Integer,List<Integer>> map = new HashMap<>();
     for( int i = 0 ; i < nums.length ; i++){
        if ( map.containsKey(nums[i]))
        map.get(nums[i]).add(i);
        else{
            List<Integer> k = new ArrayList<>();
            k.add(i);
            map.put(nums[i],k);
        }
     }
     for( int i = 0 ; i < nums.length ; i++){
        String t = Integer.toString(nums[i]);
        String reversed = new StringBuilder(t).reverse().toString();
        int k = Integer.parseInt(reversed);
        if ( map.containsKey(k)){
            List<Integer> l = map.get(k);
            for ( int j = 0; j < l.size() ;j++){
                if ( l.get(j)!=0 && l.get(j)>i){
                     ans = Math.min(ans , Math.abs(i-l.get(j)));
                if ( ans == 1)return 1;
                }
            }
        }
        if ( ans == 1)return 1;
     }
     if ( ans == Integer.MAX_VALUE)return -1;
     return ans;
    }
}