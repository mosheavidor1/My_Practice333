package Testing3;

import java.util.*;

public class Runners {

    public static void main(String[] args) {

        HashMap<String,Double>info=new HashMap<>();

        info.put("Moshe", 4.5);
        info.put("Alex", 2.5);
        info.put("John", 5.5);
        info.put("Mike", 6.5);
        getInfo (info);



    }


        private static List getInfo(HashMap<String, Double> data) {
            List<Map.Entry<String, Double>> list = new ArrayList<>(data.entrySet());
            Collections.sort(list, Comparator.comparing(Map.Entry::getValue));

            for (Map.Entry<String, Double> entry : list) {
                System.out.println(entry.getKey() + ":" + entry.getValue());


            }
            return list;
        }
}


