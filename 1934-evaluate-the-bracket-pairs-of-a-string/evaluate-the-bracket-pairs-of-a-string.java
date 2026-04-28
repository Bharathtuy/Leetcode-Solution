class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        // System.out.println(knowledge);
        HashMap<String,String> map = new HashMap<>();
        for ( int i = 0 ; i < knowledge.size() ; i++){
            // System.out.println(knowledge.get(i).get(0) +" " +knowledge.get(i).get(1) );
            map.put(knowledge.get(i).get(0) , knowledge.get(i).get(1));
        }
        String k = "";
        String key = "";
        boolean f = false ;
        for( int i = 0 ; i < s.length();i++){
            if ( f && s.charAt(i)!=')' ){
                key = key+s.charAt(i);
                continue;
            }
            if (s.charAt(i)=='('){
                // System.out.println("j");
                f = true ;
            }
            else if ( s.charAt(i)!='(' && s.charAt(i)!=')'){
                k = k+s.charAt(i);
            }
            else if ( s.charAt(i)==')'){
                f = false;
                    // System.out.println(key);
                if ( map.containsKey(key)){
                    // System.out.println(k);
                    k +=map.get(key);
                    // System.out.println(k);
                }
                else{
                    k+='?';
                }
                    key = "";

            }
        }

     return k;   
    }
}