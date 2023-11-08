package practices.parctice6;

import practices.parctice6.Print;

import java.util.*;
import java.util.stream.Collectors;

public class TestPrint {

    public static void main(String[] args) {


        exampleA();

        exampleB();

        exampleC();

        exmapleD();

    }


    public static void exampleA() {
        Print sumOf = (a, b) -> a + b;

        int result = sumOf.sum(30, 50);
        System.out.println(result);

    }


    public static void exampleB() {

        List<String> sortNames = new ArrayList<>();
        sortNames.add("Moshe");
        sortNames.add("Bob");
        sortNames.add("Alex");

        Collections.sort(sortNames, (a, b) -> a.compareTo(b));
        System.out.println(sortNames);
    }


    public static void exampleC() {

        HashMap<String, Double> results = new HashMap<>();

        results.put("Moshe", 3.5);
        results.put("Bob", 9.5);
        results.put("Alex", 7.5);

        Set<Map.Entry<String, Double>> sortedResults = new TreeSet<>(new Comparator<Map.Entry<String, Double>>() {
            @Override
            public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }

        });

        sortedResults.addAll(results.entrySet());

        System.out.println(sortedResults);
    }


    public static void exmapleD() {

        HashMap<String, Double> scores = new HashMap<>();
        scores.put("moshe", 5.5);
        scores.put("Bob", 9.5);
        scores.put("Alex", 7.5);

        scores.entrySet().stream().sorted(Map.Entry.comparingByValue()).

                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        scores.forEach((key, value) -> System.out.println(key + ": " + value));

    }


}
