package Testing5;

import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;

public class SortingMapping {


    public static void main(String[] args) {


//sorting with stream

        Map<String, Integer> map = new HashMap<>();

        map.put("Moshe", 35);
        map.put("Alex", 29);
        map.put("Bob", 30);
        map.put("John", 40);
        map.put("Jack", 54);

        Map<String, Integer> sortedMapStream = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue()).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(sortedMapStream);


//sorting with Collections.sort

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        Collections.sort(list, Comparator.comparing(Map.Entry::getValue));

        Map<String, Integer> sortedCollections = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> entry : list) {

            sortedCollections.put(entry.getKey(), entry.getValue());


        }

        System.out.println(sortedCollections);


//sorting with Comparator with lambda forEach and stream

        Map<String, Integer> sortedCompare = new LinkedHashMap<>();
        map.entrySet().stream().
                sorted(Map.Entry.comparingByValue()).forEachOrdered(x -> sortedCompare.put(x.getKey(), x.getValue()));

        System.out.println(sortedCompare);


//sorted  Comparator using set List and map.

        Set<Map.Entry<String, Integer>> set = map.entrySet();
        List<Map.Entry<String, Integer>> listOfComparator = new ArrayList<>(set);

        Collections.sort(listOfComparator, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {

                return o1.getValue().compareTo(o2.getValue());


            }
        });


        Map<String, Integer> sortedMapComparator = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> entry : listOfComparator) {
            sortedMapComparator.put(entry.getKey(), entry.getValue());

        }

        System.out.println(sortedMapComparator);



//Reversed List:

List<Integer>numbers=new ArrayList<>();
numbers.add(4);
numbers.add(3);
numbers.add(1);
numbers.add(2);

Comparator<Integer>reversed=(a,b)->b.compareTo(a);

List<Integer>reversedList=numbers.stream().sorted(reversed).collect(Collectors.toList());

System.out.println(reversedList);

//sorted list:

Collections.sort(numbers);
System.out.println(numbers);

    }

}