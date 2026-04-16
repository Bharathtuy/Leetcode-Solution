class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,List<Integer>>map = new HashMap<>();
        for( int i= 0 ; i < nums.length ; i++){
            if( map.containsKey(nums[i])){
                map.get(nums[i]).add(i);
            }
            else{
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i],list);
            }
            
            }
        for( int i = 0 ; i < queries.length ; i++){
            List<Integer> l = map.get(nums[queries[i]]);
            if( l.size() == 1){
                ans.add(-1);
                continue;
            }
            int pos = Collections.binarySearch(l,queries[i]);
            int res = Integer.MAX_VALUE;

            int right = l.get((pos-1+l.size())%l.size());
            int d1 = Math.abs(queries[i]-right);
            res = Math.min(res,Math.min(d1,nums.length-d1));
            

            int left = l.get((pos+1)%l.size());
            int d2 = Math.abs(queries[i]-left);
            res = Math.min(res,Math.min(d2,nums.length-d2));
            ans.add(res);
        }
            
        return ans;
    }
}