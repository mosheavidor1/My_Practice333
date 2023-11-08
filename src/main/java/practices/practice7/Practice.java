package practices.practice7;

import java.util.*;

public class Practice {


    public static void main(String[] args) {


        Map<String, Double> runnersData = new HashMap<>();

        runnersData.put("Moshe", 5.6);
        runnersData.put("Alex", 6.6);
        runnersData.put("John", 2.6);


        Set<Map.Entry<String, Double>> sortedRunners = new TreeSet<>(new Comparator<Map.Entry<String, Double>>() {
            @Override
            public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        sortedRunners.addAll(runnersData.entrySet());
        for (Map.Entry<String, Double> score : sortedRunners) {
            System.out.println(score.getKey() + ":" + score.getValue());

        }
    }
}