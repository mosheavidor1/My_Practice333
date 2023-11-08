package Testing2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static practices.MissingNumber.getMissingNum;

public class MissingNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size");

        int expectedSize = sc.nextInt();

        int[] expectedArr = new int[expectedSize];

        for (int i = 0; i < expectedArr.length; i++) {

            expectedArr[i] = i + 1;
        }
        System.out.println("Enter the actual array values");
        String actualString = sc.next();
        String[] actualArr = actualString.split(",");
        int[] actualSizeArr = new int[actualArr.length];

        for (int i = 0; i < actualArr.length; i++) {

            actualSizeArr[i] = Integer.parseInt(actualArr[i]);
        }
        List<Integer> list = getMissingNum(expectedArr, actualSizeArr);

        System.out.println("The missing numbers are: " + list);

    }


    private static List<Integer> getMissingNum(int[] expected, int[] actual) {


        List<Integer> expectedList = new ArrayList<>();


        boolean found ;

        for (int i = 0; i < expected.length; i++) {
            found=false;

            for (int j = 0; j < actual.length; j++) {

                if (expected[i] == actual[j]) {

                    found = true;

                    break;
                }

            }
            if (!found) {


                expectedList.add(expected[i]);

            }
        }




        return expectedList;


    }

}








