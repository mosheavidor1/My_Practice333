
package Testing4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedList {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(5);
        list.add(4);
        list.add(2);
        list.add(1);

        //Collection sort

        Collections.sort(list);

        System.out.println(list);

//Reverse sorting of collection sort
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);


        //stream sort
        List<Integer>sortedList=list.stream().sorted().collect(Collectors.toList());

        System.out.println(sortedList);

        //Reverse stream sorting
        Comparator<Integer>reversed=(a,b)->b.compareTo(a);

        List<Integer>reversedList=list.stream().sorted(reversed).collect(Collectors.toList());

        System.out.println(reversedList);


    }

    }

