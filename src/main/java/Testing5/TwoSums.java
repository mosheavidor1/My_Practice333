package Testing5;

import java.util.HashMap;
import java.util.Map;

public class TwoSums {

    public static void main(String[] args) {
        int[] b = {4, 5, 6, 8, 7, 22};
        getTwoSums(b, 9);
    }

    private static void getTwoSums(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if (map.containsKey(diff)) {
                System.out.println("target number is :" + target);
                System.out.println(arr[map.get(diff)] + " and " + arr[i]);
                return;
            } else {
                map.put(arr[i], i);
            }
        }
        System.out.println("Target was not found");
    }
}
