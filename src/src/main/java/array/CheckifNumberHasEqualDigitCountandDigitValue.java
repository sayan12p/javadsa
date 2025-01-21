package array;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CheckifNumberHasEqualDigitCountandDigitValue {

    public static boolean digitCount(String num) {
        Map<Integer,Long> map=num.chars().boxed().map(i->i-'0').collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);int i=0;boolean flag=true;
        for(Map.Entry m: map.entrySet()){
            if(map.containsKey(i)) {
                if (i < num.length() && map.get(i).equals(Long.valueOf(num.charAt(i) - '0'))) {
                    flag = true;
                    i++;
                } else {
                    flag = false;
                    break;
                }
            }else flag=false;
        }
        return flag;
    }
    public static void main(String[] args) {
        String num="1";
        System.out.println(digitCount(num));
    }
}
