package linesweep;

import java.util.Map;
import java.util.TreeMap;

class MyCalendarTwo {

    TreeMap<Integer, Integer> map;

    public MyCalendarTwo() {
        map = new TreeMap<>();
    }

    public boolean book(int startTime, int endTime) {
        map.put(startTime, map.getOrDefault(startTime, 0) + 1);
        map.put(endTime, map.getOrDefault(endTime, 0) - 1);
        int booked = 0;
        for (Map.Entry m : map.entrySet()) {
            booked += (int) m.getValue();
            if (booked > 2) {
                int newstarttime = map.get(startTime) - 1;
                int newendtime = map.get(endTime) + 1;
                map.put(startTime, newstarttime);
                map.put(endTime, newendtime);
                if (map.get(startTime) == 0) map.remove(startTime);
                if (map.get(endTime) == 0) map.remove(endTime);
                return false;
            }
        }
        return true;
    }
}
public class MyCalendarII {

    public static void main(String[] args) {
    MyCalendarTwo m=new MyCalendarTwo();
        System.out.println(m.book(10,20));
        System.out.println(m.book(50,60));
        System.out.println(m.book(10,40));
        System.out.println(m.book(5,15));
        System.out.println(m.book(5,10));
        System.out.println(m.book(25,55));
    }
}
