class Solution {
    public int countSegments(String s) {
        if(s.length()<=0)return 0;
        // String []a = s.split("/ ");
        int ans = 0;
        int c = 0;
        for( int  i = 0 ; i < s.length();i++){
            if(s.charAt(i)!=' ')       {
c=-1;
            }
            if(s.charAt(i)==' '){
                if(c==-1)ans++;
                c=0;
            }
        }
        if(c==-1)ans++;
        return ans;
    }
}