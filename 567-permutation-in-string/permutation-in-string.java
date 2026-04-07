class Solution {
    // public void find( String s1, List<String> st , StringBuilder s , boolean freq[]){
    //    if(s1.length() == s.length()){
    //         st.add(new String(s));
    //         return ;
    //     }
    //     for( int i  = 0 ;i < s1.length() ; i++){
    //         if(freq[i]==false){
    //             s.append(s1.charAt(i));
    //             freq[i]=true;
    //             find(s1,st,s,freq);
    //             freq[i]=fals e;
    //             s.deleteCharAt(s.length()-1);
    //                         }
    //     }

    // }
    public boolean checkInclusion(String s1, String s2) {
        // List<String> st = new ArrayList<>();
        // List<String> st2 = new ArrayList<>();
        // find( s1,st, new StringBuilder() , new boolean[s1.length()]);
        // // System.out.println(st);
        // for( int i = 0 ; i < st.size(); i++){
        //     if( s2.contains(st.get(i)))
        //     return true;
        // }
        // return false;

        // //  System.out.println( st2);
        // for( int i  = 0 ; i < st.size() ;i++)
        // {
        //     if(st2.contains(st.get(i)))
        //     return true;
        // }
        // return false;
        if(s1.equals(s2))return true;
        char ch[]=s1.toCharArray();
        Arrays.sort(ch);
        String s = new String(ch);
        // System.out.println(s);

        int left = 0 ;
        int right = s2.length();
        while ( left < right){
            if(s.contains(Character.toString(s2.charAt(left)))){
                if(left +s1.length() <= s2.length() ){
                    String k = s2.substring(left,left+s1.length());
                    char[]m = k.toCharArray();
                    Arrays.sort(m);
                    String n = new String(m);
                    if(n.equals(s))return true;
                    
                }
            }
            if(s.contains(Character.toString(s2.charAt(right-1)))){
                if( right-s1.length() >left){
                    System.out.println("j");
                    String k = s2.substring(right-s1.length(),right);
                    char[]m = k.toCharArray();
                    Arrays.sort(m);
                    String n = new String(m);
                    if(n.equals(s))return true;
                }
            }
            left++;
            right--;
                
            
        }
        return false;

    }
}