class Solution {
    public boolean checkRecord(String s) {
        int a_count = 0;
        int l_count = 0;
        for ( int i = 0; i < s.length() ; i++){
            if(l_count!=0 && s.charAt(i)!='L')l_count=0;
            if ( s.charAt(i)=='A'){a_count++;
            }
            if(a_count ==2)return false;
            if ( s.charAt(i)=='L')l_count++;
            if(l_count ==3)return false;
        }
        return true;
        
    }
}