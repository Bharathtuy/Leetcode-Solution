class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char c1 = s1.charAt(0);
        char c2 = s1.charAt(1);
        char c3 = s1.charAt(2);
        char c4 = s1.charAt(3);
        if(s1.equals(s2))return true;
        else{
            if(s2.charAt(0)==c3 && s2.charAt(1)==c4 && s2.charAt(2)==c1 && s2.charAt(3)==c2)return true;
            if(s2.charAt(0)==c1 && s2.charAt(1)==c4 && s2.charAt(2)==c3 && s2.charAt(3)==c2)return true;
            if(s2.charAt(0)==c3 && s2.charAt(1)==c2 && s2.charAt(2)==c1 && s2.charAt(3)==c4)return true;
            else return false;
        }
    }
}