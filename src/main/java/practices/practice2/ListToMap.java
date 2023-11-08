package practices.practice2;

import java.util.HashMap;
import java.util.Map;

public class ListToMap {

    public static void main(String[] args) {


        SortedList.listInfo();

        Map<String,Integer> map=new HashMap<>();

        //turn list to map
        int age=10;
        for(String name:SortedList.listInfo()){
            map.put(name,age);
            age++;
        }
        System.out.println(map);
    }
}
