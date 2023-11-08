package practices.practice10;

import java.util.Arrays;

public class MissingNumber2 {
    public static void main(String[] args) {
        int[] arr={1,7,3,4,6,5,8,9,10,0};

        int missingNumber = findMissingNumber(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("The missing number is: " + missingNumber);


    }

    private static int findMissingNumber(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        return -1; // not found
    }
}

