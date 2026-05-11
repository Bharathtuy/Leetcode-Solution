class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> l = new ArrayList<>();
        for( int i = 0 ; i  < nums.length ; i++){
            if ( nums[i] < 10){
                l.add(nums[i]);
            }
            else if ( nums[i] < 100){
            StringBuilder sb = new StringBuilder(String.valueOf(nums[i]));
            nums[i] = Integer.parseInt(sb.reverse().toString());

                
                l.add(nums[i]%10);
                nums[i] = nums[i]/10;
                l.add(nums[i]);
            }
            else if ( nums[i] < 1000){
                 StringBuilder sb = new StringBuilder(String.valueOf(nums[i]));
            nums[i] = Integer.parseInt(sb.reverse().toString());
                 l.add(nums[i]%10);
                nums[i] = nums[i]/10;
                l.add(nums[i]%10);
                nums[i] = nums[i]/10;
                l.add(nums[i]);
                
            }
                else if ( nums[i] < 10000){
                     StringBuilder sb = new StringBuilder(String.valueOf(nums[i]));
            nums[i] = Integer.parseInt(sb.reverse().toString());
                    l.add(nums[i]%10);
                    nums[i] = nums[i]/10;
                    l.add(nums[i]%10);
                    nums[i] = nums[i]/10;
                    l.add(nums[i]%10);
                    nums[i] = nums[i]/10;
                    l.add(nums[i]);
                    
                }
                else if ( nums[i] <100000){
                     StringBuilder sb = new StringBuilder(String.valueOf(nums[i]));
            nums[i] = Integer.parseInt(sb.reverse().toString());
                 l.add(nums[i]%10);
                nums[i] = nums[i]/10;
                l.add(nums[i]%10);
                nums[i] = nums[i]/10;
                l.add(nums[i]%10);
                nums[i] = nums[i]/10;
                l.add(nums[i]%10);
                nums[i] = nums[i]/10;
                l.add(nums[i]);
                
            }
            if ( nums[i] == 100000){
                l.add(1);
                l.add(0);
                l.add(0);
                l.add(0);
                l.add(0);
                l.add(0);
            }

        }
        System.out.println(l);
        int n[] = new int[l.size()];
        for ( int i = 0 ; i < l.size();i++){
            n[i] = l.get(i);
        }
        return n;
        
    }
}