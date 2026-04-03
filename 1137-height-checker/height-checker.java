class Solution {
    public int heightChecker(int[] heights) {
        int k[] = new int [heights.length];
        for( int i = 0 ; i< k.length ;i++)k[i]=heights[i];
        Arrays.sort(k);
        int ans = 0 ;
        for ( int i = 0 ;i < heights.length; i++)
        {System.out.println(heights[i]+" "+k[i]);
            if(k[i]!=heights[i])ans++;}
        return ans;
    }
}