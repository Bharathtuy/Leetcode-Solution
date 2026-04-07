class DataStream {
    List<Integer> list;
    int cur ;
    int size ;
    public DataStream(int value, int k) {
        list = new ArrayList<>();
        // list.add(value);
        cur = value;
        size=k;
        // k--;
    }
    
    public boolean consec(int num) {
        if(cur == num)
        {
            list.add(num);
            // k--;
        }
        else{
            list = new ArrayList<>();
            // System.out.println(list);
            // list.add(num);
            // cur = num;
        }
        System.out.println(list.size());
        if(size<=list.size() )return true;
        else return false;
        
    }
}

/**
 * Your DataStream object will be instantiated and called as such:
 * DataStream obj = new DataStream(value, k);
 * boolean param_1 = obj.consec(num);
 */