class Solution {
    // Set<Integer> l = new TreeSet<>();
       Set<Integer> l = new TreeSet<>();
    public void makeans(int dig[] , boolean occur[],String temp){
        if( temp.length()==3 && Integer.parseInt(temp)>=100){
            if(Integer.parseInt(temp)%2==0)l.add(Integer.parseInt(temp));

        return ;
        }
        for( int i = 0 ; i < dig.length ; i++){
            if(dig[i]==0 && temp.length()==0)continue;
            if(temp.length()==2 && dig[i]%2!=0)continue;
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
    public int[] findEvenNumbers(int[] dig) {
            makeans(dig , new boolean[dig.length],new String("")); 
            // Collections.sort(l);
            //  System.out.println(l);
            int[] arr = l.stream().mapToInt(Integer::intValue).toArray();
            return arr;  
    }
}