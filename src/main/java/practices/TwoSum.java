package practices;


import org.testng.reporters.jq.INavigatorPanel;

import java.util.*;


public class TwoSum {

    public static void main(String[] args) {

        int[] b = {4, 6, 2, 8};

        System.out.println(sumOf(b, 10));

    }


    private static boolean sumOf(int[] a, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            int var1 = target - a[i];
            if (map.containsKey(var1)) {
                System.out.print(var1);
            } else {
                map.put(a[i], i);
            }
        }
        return true;
    }

}








//singleton

//sorting List, set , map . using stream with lambdas and forEach,using collection.sort,new comparator.(Runners and single list)

//Recursions

//Abstract . Interface, get set , constructor, toString.


//sum of Arrays

//two sum - sum of two numbers equal to one of the numbers in the array.

//sumOfNumbers




//Parallel searching - with treads and with for loops .

//Api (post , get , put , delete)

//mising number - comapring between two array - expected and acutal and find the missing number (sort the actual array);
//missing number2- array of 99 size. number between 0-100, one of the numbers is missing . need to return it .




