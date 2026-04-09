class Solution {
    public int numRabbits(int[] a) {
        // Set<Integer> set = new HashSet<>();
        HashMap<Integer,Integer>map = new HashMap<>();
        int ans = 0;
        for( int i = 0 ; i < a.length ; i++){
            if(a[i]==0)ans++;
            else{
            if(map.containsKey(a[i]) && map.get(a[i])!=0 ){
                map.put(a[i],map.get(a[i])-1);
                // if(a[i]==0)ans++;

            }
            else{
                map.put(a[i],a[i]);

                ans+=a[i]+1;
            }
            }
        }
        return ans;
    }
}