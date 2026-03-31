class Solution {
    public int maxProduct(int n) {
        String t = Integer.toString(n);
        String ar[] = t.split("");
        // for( int i = 0 ; i  < ar.length ; i++)System.out.println(ar[i]);
        Arrays.sort(ar);  
        int a = Integer.parseInt(ar[ar.length-1]);
        int b = Integer.parseInt(ar[ar.length-2]);
        // System.out.println();
        return a*b ;
    }
}