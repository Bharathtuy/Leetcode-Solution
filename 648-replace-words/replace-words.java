class Solution {
    public String replaceWords(List<String> dict, String sentence) {
        // return ;
        String ar[]= sentence.split(" ");
        Collections.sort(dict);
        // Arrays.sort(ar);
        for( int i = 0 ; i < dict.size() ;i++){
                for( int j = 0 ; j < ar.length ;j++){
                    if(dict.get(i).length()<ar[j].length()){
                    if( ar[j].substring(0,dict.get(i).length()).equals(dict.get(i))){
                        ar[j]=dict.get(i);
                    }
                    }
                }
        }
        String ans = "";
        for(int i = 0 ; i < ar.length ;i++){
            // System.out.println(ar[i]);ans
            if( i != ar.length-1)
            ans+=ar[i]+" ";
            else 
            ans+=ar[i];
        }
        return ans;
    }
}