class Bitset {

    char []arr;
    boolean bits ;
    int cnt ;
    public Bitset(int size) {
        arr = new char[size];
        bits = false;
        cnt = 0;
        Arrays.fill( arr, '0');
    }
    
    public void fix(int idx) {
        if ( bits == false){
        if ( arr[idx]!='1'){
            cnt++;
            arr[idx]='1';
        }}
        else {
            if ( arr[idx]=='1'){
                arr[idx]='0';
                cnt++;
            }
        }
        
    }
    
    public void unfix(int idx) {
 if ( bits == false){
        if ( arr[idx]!='0'){
            cnt--;
            arr[idx]='0';
        }}
        else {
            if ( arr[idx]=='0'){
                arr[idx]='1';
                cnt--;
            }
        }        
    }
    
    public void flip() {
        bits = !bits;
        cnt = arr.length - cnt;
        
    }
    
    public boolean all() {
        return cnt == arr.length;
        
    }
    
    public boolean one() {
        return cnt > 0;
    }
    
    public int count() {
        return cnt ;
    }
    
    public String toString() {
        StringBuilder res = new StringBuilder();
        if ( bits == false){
            for( int i = 0 ; i < arr.length;i++){
                res.append(arr[i]);
            }
        }
        else{
            for( int i = 0; i < arr.length ; i++){
                if ( arr[i] == '0'){
                    res.append('1');
                }
                else
                res.append('0');
            }

        }
        return new String(res);
    }
}

/**
 * Your Bitset object will be instantiated and called as such:
 * Bitset obj = new Bitset(size);
 * obj.fix(idx);
 * obj.unfix(idx);
 * obj.flip();
 * boolean param_4 = obj.all();
 * boolean param_5 = obj.one();
 * int param_6 = obj.count();
 * String param_7 = obj.toString();
 */