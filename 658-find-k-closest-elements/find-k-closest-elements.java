class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list  = new ArrayList<>();
        boolean is_found = false;
        int index = -1;
        int its_index = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if( arr[i] == x){
                index=i;
                is_found=true;
                break;
            }
            else if ( x > arr[i]){
                its_index++;
            }
        }
        // System.out.println(its_index);
        if(is_found || its_index > -1 && its_index < arr.length){
            if(is_found){
            list.add(x);
            k--;}

            int left = index-1;
            int right = index+1;
            if(is_found ==false)
            {
                System.out.println(its_index);
                left = its_index-1;
                right= its_index;
            }
            System.out.println(left+" "+right);
            while ( left >=0 && right<arr.length && k>0){
                 if(Math.abs(x-arr[left]) > Math.abs(x-arr[right]))       {
                    list.add(arr[right]);
                    right++;
                 }
                 else {
                    list.add(arr[left]);
                    left--;
                 }
                 k--;
            }
            while(left >=0 && k>0){
                 list.add(arr[left]);
                    left--;
                    k--;
            }
             while(right < arr.length && k>0){
                 list.add(arr[right]);
                    right++;
                    k--;
            }
        }
       
        else {
            // System
            if(Math.abs(x-arr[0]) > Math.abs(x-arr[arr.length-1])){
                for(int i = arr.length-1;i > arr.length-1-k ; i--){
                    list.add(arr[i]);
                }
            }
            else{
                for( int i = 0 ;i < k ;i++){
                    list.add(arr[i]);
                }
            }
        }
        Collections.sort(list);
        return list;
        
    }
}