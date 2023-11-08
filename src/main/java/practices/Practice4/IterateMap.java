package practices.Practice4;

import java.util.HashMap;
import java.util.Map;

public class IterateMap {

    public static void main(String[] args) {


        Map<String, Integer> map = new HashMap<>();

        map.put("Moshe", 39);
        map.put("Alex", 30);
        map.put("Ben", 32);
        map.put("Bob", 41);
        map.put("Dan", 29);

        //Map entry:

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //Using forEach :

        map.forEach((key, value) -> System.out.println(key + " " + value));

        //Iterating by using Stream parallel:

        map.keySet().stream().parallel().forEach(key-> System.out.println(key+" "+map.get(key)));

    }







}

