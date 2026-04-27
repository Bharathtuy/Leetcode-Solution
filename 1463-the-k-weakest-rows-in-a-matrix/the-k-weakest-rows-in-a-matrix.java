class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        List<Integer> l  = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for ( int i = 0 ; i < mat.length; i++){
            int count = 0 ;
            for( int j = 0 ; j < mat[0].length ; j++){
                if (mat[i][j]==1)count++;
            }
            map.put(i,count);
            l.add(count);


        }
        Collections.sort(l);
        int ans[] = new int[k];
        int itr  = 0 ;
        while(itr !=k){
            for (  int m : map.keySet()){
                if ( map.get(m)== l.get(itr)){
                    ans[itr++]= m ;
                    map.remove(m);
                    break;
                }
                if ( k ==itr)return ans;
            }
        }
        return ans;

    }
}