class Solution {
    public int minimumLength(String s) {
        int left = 0;
        int right = s.length()-1;
        
        while( left <=right){
            if(s.charAt(left)==s.charAt(right) && left!=right){
                char t = s.charAt(left);
                    while(s.charAt(left)==s.charAt(right) && left<right){
                        left++;
                    }
                    while(t==s.charAt(right)&& right >=left)
                    right--;
                    System.out.println(left+" "+right);
            }
            else{
                return right-left+1;
            }
        }
        return 0;

    }
}