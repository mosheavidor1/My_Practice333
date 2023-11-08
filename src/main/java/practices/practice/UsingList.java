package practices.practice;


import java.util.*;

public class UsingList {

    public static void main(String[] args) {

        HashMap<String, Double> runnersInfo = new HashMap<>();
        runnersInfo.put("Moshe", 3.5);
        runnersInfo.put("Danny", 6.5);
        runnersInfo.put("Mike", 8.5);
        runnersInfo.put("Bill", 9.5);
        runnersInfo.put("John", 2.5);

        List<Map.Entry<String, Double>> scores = new LinkedList<>();
        Comparator<Map.Entry<String, Double>> compareScores = new Comparator<Map.Entry<String, Double>>() {
            @Override
            public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {

                if (o1.getValue() > o2.getValue()) {
                    return 1;

                } else if (o1.getValue() < o2.getValue()) {
                    return -1;
                } else {
                    return 0;
                }
            }

        };
        scores.addAll(runnersInfo.entrySet());

        scores.sort(compareScores);
        System.out.println(scores);


    }
}
