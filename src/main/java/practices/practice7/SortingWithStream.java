
package practices.practice7;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SortingWithStream {
    public static void main(String[] args) {
        // Creating a HashMap with some elements
        Map<Integer, String> map = new HashMap<>();
        map.put(4, "four");
        map.put(2, "two");
        map.put(1, "one");
        map.put(3, "three");

        // Sorting the keys of the HashMap using a TreeSet and a Stream
        TreeSet<Integer> sortedKeys = map.keySet()
                .stream()
                .sorted()
                .collect(Collectors.toCollection(TreeSet::new));

        // Printing the sorted keys and their corresponding values
        for (Integer key : sortedKeys) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
