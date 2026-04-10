class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int width = 0;
        int ans = -2147484;
        for( int i =  0; i < wall.get(0).size() ;i++){
            width+=wall.get(0).get(i);
        }
        for( int i = 0 ; i < wall.size() ;i++){
            int val  = 0;
            for( int j = 0; j < wall.get(i).size() ;j++){
                 val += wall.get(i).get(j);
                map.put(val,map.getOrDefault(val,0)+1);
            }
        }
        for( int ke : map.keySet()){
            if(width != ke){
                ans = Math.max(ans,map.get(ke));

            }
        }
        if(ans <0)return wall.size();

        System.out.println(map);

        return wall.size()-ans;
    }
}