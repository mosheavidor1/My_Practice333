package practices.practice2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MapToList {

    public static void main(String[] args) {

        Map<String,Integer>map=new HashMap<>();
        map.put("moshe",35);
        map.put("John",45);
        map.put("Bob",75);
        map.put("Ben",15);

        System.out.println(map);

        //Turn map to list
        //only key-names
        List<String>names=new LinkedList<>(map.keySet());
        System.out.println(names);
       //only values - age
        List<Integer>values=new LinkedList<>(map.values());
        System.out.println(values);
       //both key and value - name and age
        List<Map.Entry<String,Integer>>both=new LinkedList<>(map.entrySet());
        System.out.println(both);
    }
}
