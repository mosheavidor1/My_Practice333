package Testing3;

import java.util.*;
import java.util.stream.Collectors;

public class Results {


    public static void main(String[] args) {

        HashMap<String, Double> map = new HashMap<>();

        map.put("John", 5.4);
        map.put("Alex", 1.4);
        map.put("Moshe", 3.4);

       runners(map);


    }

    private static Set<Map.Entry<String, Double>> runners(HashMap<String, Double> info) {

        info.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .forEach(entry-> System.out.println(entry.getKey()+":"+entry.getValue()));

        return info.entrySet();
    }
}


