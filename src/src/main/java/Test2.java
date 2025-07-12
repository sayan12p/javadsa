import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;
import java.util.stream.Collectors;

//class Run1 implements Runnable{
//
//    int counter=0;
//    @Override
//    public void run() {
//        for (int i=0;i<10;i++){
//            counter++;
//            System.out.println("counter value "+counter);
//            System.out.println("Thread name "+ Thread.currentThread().getName());
//        }
//    }
//}

public class Test2 {
    //CountOfWordsStartingWithSameCharacter()
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Sayan","abhik","ahin","roun");
        Map<Integer, List<String>> collect = list.stream().collect(Collectors.groupingBy(String::length,Collectors.mapping(Function.identity(),Collectors.toList())));
        Map<Character, Long> collect1 = list.stream().collect(Collectors.groupingBy(e->e.charAt(0),Collectors.counting()));
        System.out.println(collect);
        System.out.println(collect1);
        String input = "Java is my programming language";
        input.chars().mapToObj((c)->(char)c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()==1).skip(1L).map(e->e.getKey()).findAny().ifPresentOrElse((x)->System.out.println(x),()-> System.out.println("empty"));
//        List<Integer> l=Arrays.asList(1,51,314,614,567,892);
//        for(int i:l){
//            int length= String.valueOf(i).length();
//            if(length>2) {
//                int secondigit = (i / 10) % 10;
//                if (secondigit == 1) System.out.println(i);
//            }else if(length==2){
//                int secondigit = (i % 10);
//                if (secondigit == 1) System.out.println(i);
//            }
//        }
//        ExecutorService executorService= Executors.newFixedThreadPool(10);
//        for(int i=0;i<10;i++){
//            //executorService.submit(new Run1());
//            executorService.execute(new Run1());
//        }
//        executorService.shutdown();
    }
}
