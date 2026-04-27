class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> ans =  new ArrayList<>();

        for ( int i = 0 ; i < queries.length ; i++){
            for ( int j = 0 ; j < dictionary.length ;j++){
                int limit = 2 ;
                int f = 0 ;
                for ( int k = 0 ; k < queries[i].length()  && k < dictionary[j].length(); k++){
                    if ( dictionary[j].charAt(k)==queries[i].charAt(k)){

                    }
                    else {
                        limit--;
                    }
                    if ( limit == -1 ){
                            f =  1;
                    }
                }
                if ( f == 0){ans.add(queries[i]);
                break;}
            }
        }
        return ans;
    
    }
}