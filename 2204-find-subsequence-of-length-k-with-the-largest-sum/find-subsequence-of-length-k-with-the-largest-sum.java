class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int [] ans = new int[k];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for( int i = 0 ; i < nums.length ; i++){
            pq.add(nums[i]);
        }
        while(pq.size()!=k)pq.poll();
        int ans_itr = 0;
        for( int i = 0 ; i  < nums.length ; i++){
            if(ans_itr == k)return ans;
            if(pq.contains(nums[i])){
                ans[ans_itr++]=nums[i];
                pq.remove(nums[i]);
                
            }
        }
        return ans;
        
    }
}