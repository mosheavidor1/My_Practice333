package Testing5;

import java.util.*;
import java.util.stream.Collectors;

public class SortingMap{

    public static void main(String[] args) {


        Map<String, Integer> map = new HashMap<>();

        map.put("Moshe", 39);
        map.put("John", 32);
        map.put("Alex", 45);
        map.put("Bob", 34);


        //sorting list using stream

        Map<String, Integer> sortedList = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(sortedList);

        //sorting list using Collections.sort
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, Comparator.comparing(Map.Entry::getValue));

        Map<String, Integer> sortByMap = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> entry : list) {
            sortByMap.put(entry.getKey(), entry.getValue());

        }

        System.out.println(sortByMap);

        //sorting list using comparator

        Map<String,Integer>sortedByComparator=new LinkedHashMap<>();

       map.entrySet().stream().sorted(Map.Entry.comparingByValue())
       .forEachOrdered(x->sortedByComparator.put(x.getKey(),x.getValue()));


        System.out.println(sortedByComparator);


    }

}