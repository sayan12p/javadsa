package linesweep;

import java.util.*;

class Interval {
     public int start, end;
     public Interval(int start, int end) {
         this.start = start;
         this.end = end;
     }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
public class MeetingRooms {

    public static boolean canAttendMeetings(List<Interval> intervals) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<intervals.size();i++){
            Interval in=intervals.get(i);
            map.put(in.getStart(),map.getOrDefault(in.getStart(),0)+1);
            map.put(in.getEnd(),map.getOrDefault(in.getEnd(),0)-1);
        }
        int count=0;
        for(Map.Entry m:map.entrySet()){
            count+=(int)m.getValue();
            if(count>1) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        List<Interval> intervals = Arrays.asList(new Interval(5,8),new Interval(9,15));
        System.out.println(canAttendMeetings(intervals));
    }
}
