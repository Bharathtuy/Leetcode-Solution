class Solution {
    public boolean hasAllCodes(String s, int k) {
        int n =(int) Math.pow(2,k);
        Set<Integer> set  = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for( int i = 0; i < n  ; i++)set.add(i);
        // System.out.println(list);
        for( int i = 0; i <= s.length()-k;i++ ){
            int j = Integer.parseInt(s.substring(i,i+k),2);
            set.remove(Integer.valueOf(j));
            if(set.isEmpty())return true;

        }
        // System.out.println(list);
        return set.isEmpty();
    }
}