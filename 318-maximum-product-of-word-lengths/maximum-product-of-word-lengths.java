class Solution {
    public int maxProduct(String[] words) {
        // int ans = 0;
        List<List<Integer>> l = new ArrayList<>();
        for( int i = 0  ; i < words.length ; i++){
            char[]t = words[i].toCharArray();
            Arrays.sort(t);
            String k = new String(t);
            words[i]=k;
            }
            int ans = 0;
            Arrays.sort(words);
            for( int i = 0 ; i < words.length ; i++){
                for( int j = i+1 ; j < words.length ; j++){
                    String t1 =words[i];
                    String t2 = words[j];
                    int itr = 0;
                    boolean f = false;
                    if(t1.charAt(t1.length()-1) < t2.charAt(0))
                    {
                        
                        ans = Math.max(ans,t1.length()*t2.length());
                        continue;
                    }
                    while(itr < t1.length()){
                        if(t2.contains(t1.substring(itr,itr+1))) {
                            f = true;
                            break;
                        }
                        itr++;
                    }
                    if(f==false){
                        ans = Math.max(ans,t1.length()*t2.length());
                    }
                    
            }
            }
            // if(ans< 0)return 0;
        
        return ans;

    }
}