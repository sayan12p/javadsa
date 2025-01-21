package array;

import java.util.*;

public class DisplayTableofFoodOrdersinaRestaurant {

    public static List<List<String>> displayTable(List<List<String>> orders) {
        TreeMap<Integer, Map<String, Integer>> map = new TreeMap<>();
        List<List<String>> res = new ArrayList<>();
        TreeSet<String> set = new TreeSet<>();
        List<String> firstrow = new ArrayList<>();
        firstrow.add("Table");
        for (int i = 0; i < orders.size(); i++) {
            String dish = orders.get(i).get(2);
            set.add(dish);
            Integer table = Integer.parseInt(orders.get(i).get(1));
            map.putIfAbsent(table, new HashMap<>());
            if (map.get(table).containsKey(dish)) {
                Map<String, Integer> dishmap = map.get(table);
                dishmap.put(dish, dishmap.getOrDefault(dish, 0) + 1);
            } else {
                map.get(table).put(dish, 1);
            }
        }
        firstrow.addAll(set);
        res.add(firstrow);
        System.out.println(map);
        for (Map.Entry<Integer, Map<String, Integer>> entry : map.entrySet()) {
            List<String> list = new ArrayList<>();
            list.add(entry.getKey() + "");
            Map<String, Integer> m = entry.getValue();
            for (String dish : set) {
                if (m.containsKey(dish)) {
                    list.add(m.get(dish) + "");
                } else {
                    list.add("0");
                }
            }
            res.add(list);

        }
        return res;
    }
    public static void main(String[] args) {
        List<List<String>> orders = new ArrayList<>();
        List<String> order1 = Arrays.asList(new String[]{"David", "3", "Ceviche"});
        List<String> order2 = Arrays.asList(new String[]{"Corina", "10", "Beef Burrito"});
        List<String> order3 = Arrays.asList(new String[]{"David", "3", "Fried Chicken"});
        List<String> order4 = Arrays.asList(new String[]{"Carla", "5", "Water"});
        List<String> order5 = Arrays.asList(new String[]{"Carla", "5", "Ceviche"});
        List<String> order6 = Arrays.asList(new String[]{"Rous", "3", "Ceviche"});
        orders.add(order1);
        orders.add(order2);
        orders.add(order3);
        orders.add(order4);
        orders.add(order5);
        orders.add(order6);
        System.out.println(displayTable(orders));
    }
}
