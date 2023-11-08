package package9;

import java.util.*;
import java.util.stream.Collectors;

public class RunnersResults {
    public static void main(String[] args) {


        Map<String, Double> map = new HashMap<>();

        map.put("Moshe", 1.4);
        map.put("Alex", 1.5);
        map.put("Jack", 2.5);
        map.put("Bob", 1.2);

      runnersInfo(map);


    }


    private static List<Map.Entry<String, Double>> runnersInfo(Map<String, Double> data) {

        List<Map.Entry<String, Double>> sortedRunnersList = new ArrayList<>(data.entrySet());

        Collections.sort(sortedRunnersList, Comparator.comparing(Map.Entry::getValue));


        for (Map.Entry<String, Double> entry : sortedRunnersList) {

            System.out.println(entry.getKey() + " :" + entry.getValue());


        }

        return sortedRunnersList;
    }
}
