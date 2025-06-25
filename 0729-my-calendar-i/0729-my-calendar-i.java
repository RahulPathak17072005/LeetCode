class MyCalendar {
    ArrayList<int[]> arr;
    public MyCalendar() {
        arr=new ArrayList<>();
        arr.add(new int[]{0,0});
    }
    
    public boolean book(int startTime, int endTime) {
        boolean check=true;
        for(int i=0;i<arr.size();i++){
           int[] event=arr.get(i);
           if(!(endTime<=event[0] || startTime>=event[1])){
            check=false;
           }
            if(!check)return false;
        }
        arr.add(new int[] {startTime,endTime});
        return check;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */