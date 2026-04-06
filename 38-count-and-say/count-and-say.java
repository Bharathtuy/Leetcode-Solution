class Solution {
    public String read(String t){
        String ans = "";
        int cnt = 1 ;
        for( int i = 0 ; i < t.length()-1;i++){
            if( t.charAt(i+1)==t.charAt(i)){
                cnt++;
            }
            else{
                 ans+=Integer.toString(cnt)+t.charAt(i);
                    cnt = 1;
            }
        }
        if( cnt != 0){
            ans+=Integer.toString(cnt)+t.charAt(t.length()-1);
        }
        System.out.println(ans+"l");
        // if(cnt == 0){
        //     ans ="11";
        // }
        return ans;
    }
    public String countAndSay(int n) {
        // return new String("34");
        if( n == 1 )return new String("1");
        String t = "1";
        int k = n-1;
        while(k>0){
            String l = read(t);
            t = new String(l);
            System.out.println(t);
            k--;
        }
        return t;
    }
}