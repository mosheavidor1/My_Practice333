package practices.practice10;

import javax.annotation.meta.When;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WrongValidation {


    public static void main(String[] args) {

        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7, 8};

        int[] actualArray = {1,3,5,7, 8};

        System.out.println("The missing numbers are: "+getMissingNumbers(expectedArray,actualArray));

    }

    private static List<Integer>getMissingNumbers(int[] e, int[] a) {

        List<Integer>missingNumbers=new ArrayList<>();

        int i = 0;
        int j = 0;




        while (true) {

         try {
             if (e[i] != a[j]) {
                missingNumbers.add(e[i]);

                 i++;
                 j++;

             }else {

                 i++;
                 j++;
             }
         }catch (Exception ArrayIndexOutOfBoundsException){
             break;
         }

            }

        return missingNumbers;
    }
    }








