package practices.practice;

import java.util.*;

public class UsingTreeSet {

    public static void main(String[] args) {

        HashMap<String, Double> runnersInfo = new HashMap<>();
        runnersInfo.put("Moshe", 3.5);
        runnersInfo.put("Danny", 6.5);
        runnersInfo.put("Mike", 8.5);
        runnersInfo.put("Bill", 9.5);
        runnersInfo.put("John", 2.5);

        Set<Map.Entry<String, Double>>scores = new TreeSet<>(
                new Comparator<Map.Entry<String, Double>>() {
                    @Override
                    public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {
                        return o1.getValue().compareTo(o2.getValue());
                    }
                }
        );

       scores.addAll(runnersInfo.entrySet());

        for (Map.Entry<String, Double> score : scores) {
            System.out.println(score.getKey() + ":" + score.getValue());
        }
    }
}