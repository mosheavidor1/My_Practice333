package practices.practice7;

import java.util.*;

public class SortWithCollectionSort {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(4, "four");
        map.put(2, "two");
        map.put(1, "one");
        map.put(3, "three");

        List<Map.Entry<Integer,String>>entries=new LinkedList<>(map.entrySet());

        Collections.sort(entries, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getKey().compareTo(o2.getKey());
            }
        });

for(Map.Entry<Integer,String>entry:entries){
    System.out.println(entry.getKey()+":"+entry.getValue());
}

    }
}
