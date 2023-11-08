package Testing8;

import java.util.*;

import java.util.ArrayList;
import java.util.List;

public class MissingNumber {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter size of expected array: ");
            int expectedSize = scanner.nextInt();
            int[] expected = new int[expectedSize];

            for (int i = 0; i < expectedSize; i++) {
                expected[i] = i + 1;
            }

            System.out.print("Enter actual array: ");
            String actualString = scanner.next();
            String[] actualArray = actualString.split(",");
            int[] actual = new int[actualArray.length];

            for (int i = 0; i < actualArray.length; i++) {
                actual[i] = Integer.parseInt(actualArray[i]);
            }

            List<Integer> list = new ArrayList<>(expectedSize);
            list = compareArrays(expected, actual);

            System.out.println(list);
        }

        public static List<Integer> compareArrays(int[] expected, int[] actual) {
            List<Integer> missingNumbers = new ArrayList<>();
            for (int i = 0; i < expected.length; i++) {
                boolean found = false;
                for (int j = 0; j < actual.length; j++) {
                    if (expected[i] == actual[j]) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    missingNumbers.add(expected[i]);
                }
            }
            System.out.println("Missing numbers: " + missingNumbers);
            return missingNumbers;
        }
    }

