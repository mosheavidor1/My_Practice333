package practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumber {

    public static void main(String[] args) {
        int[] expected = {1, 2, 3, 4, 5, 6};
        int[] actual = {1, 3, 2, 6, 4};

        // Sort the actual array before passing it to the method
        Arrays.sort(actual);

        // Call the method and print the result
        List<Integer> missingNums = getMissingNum(expected, actual);
        System.out.println("Missing numbers: " + missingNums);
    }

    public static List<Integer> getMissingNum(int[] expected, int[] actual) {
        List<Integer> arrList = new ArrayList<>();

        // Loop through the expected array and check if each element is in the actual array
        for (int i = 0; i < expected.length; i++) {
            boolean found = false;
            for (int j = 0; j < actual.length; j++) {
                if (expected[i] == actual[j]) {
                    found = true;
                    break;
                }
            }
            // If the element is not found, add it to the list
            if (!found) {
                arrList.add(expected[i]);
            }
        }
        return arrList;
    }
}