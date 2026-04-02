class MyCalendar {
    List<List<Integer>> ans ;
    public MyCalendar() {
        ans = new ArrayList<>();

    }
    
    public boolean book(int st, int en) {
        // System.out.println(ans);
        for( int i = 0 ; i < ans.size() ; i++){
            if(  ans.get(i).get(0) <= st && ans.get(i).get(1) >st   )return false;
            if ( ans.get(i).get(0) < en && ans.get(i).get(1) >=en   )return false;
            if(st <  ans.get(i).get(0)  && en >ans.get(i).get(0)  )return false;
        }
        List<Integer> t = new ArrayList<>();
        t.add(st);
        t.add(en);
        ans.add(t);

        Collections.sort(ans, (a, b) -> a.get(0) - b.get(0));
        return true;
        
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */