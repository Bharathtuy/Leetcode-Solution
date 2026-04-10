class Solution {
    public String longestWord(String[] words) {
        // List<String> list = new ArrayList<>();
        HashSet<String> list = new HashSet<>();
        Arrays.sort(words);
        for( int i = 0 ;i < words.length ; i++)list.add(words[i]);
        String ans ="";
        for( int i = 0 ; i <words.length ;i++){
            boolean flag = false;
            for( int j = 0; j <words[i].length() ;j++){
                if(list.contains(words[i].substring(0,j+1))){

                }
                else{
                    flag = true;
                    break;}
            }
            if(flag==false){
                if(ans.length()< words[i].length()){
                    ans=words[i];
                }
            }


        }
        return ans;
    }
}