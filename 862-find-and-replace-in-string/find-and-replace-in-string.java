class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {

        HashMap<Integer,String> map = new HashMap<>();
        HashMap<Integer,String> map2 = new HashMap<>();
        String res = "";
        for( int i = 0 ; i < indices.length ;i++ ){
            if((indices[i]+sources[i].length()  ) > s.length()){
                break;
            }
            if ( s.substring(indices[i],indices[i]+sources[i].length()).equals(sources[i])){
                System.out.println(s.substring(indices[i],indices[i]+sources[i].length()));
                map.put(indices[i],targets[i]);
            }
            else{
                sources[i]= "null";
            }
        }
        for( int i = 0 ; i < indices.length ; i++){
            if (sources[i].equals("null")){}
            else
            map2.put(indices[i],sources[i]);
        }
        System.out.println(map);
        for ( int i = 0; i <s.length() ;i++ ){
            if ( map.containsKey(i)){
                res = res+map.get(i);
                System.out.println(map2.get(i).length());
                i += map2.get(i).length()-1;
            }
            else{
                res=res+s.charAt(i);
            }
        }
        return res;
    }
}