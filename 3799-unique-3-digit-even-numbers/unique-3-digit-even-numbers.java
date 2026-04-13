class Solution {
      Set<Integer> l = new TreeSet<>();
    public void makeans(int dig[] , boolean occur[],String temp){
        if( temp.length()==3 && Integer.parseInt(temp)>=100){
            if(Integer.parseInt(temp)%2==0)l.add(Integer.parseInt(temp));

        return ;
        }
        for( int i = 0 ; i < dig.length ; i++){
            if(temp.length()> 3)return ;
            if( occur[i]==false){
                occur[i]=true;
                temp= temp+Integer.toString(dig[i]);
                makeans(dig,occur,temp);
                
                occur[i]=false;
                temp = temp.substring(0,temp.length()-1);
            }
        }

    }
    public int totalNumbers(int[] dig) {
        makeans(dig,new boolean[dig.length],new String(""));
        return l.size();
    }
}