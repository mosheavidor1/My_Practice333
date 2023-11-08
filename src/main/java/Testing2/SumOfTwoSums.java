package Testing2;

import java.util.ArrayList;
import java.util.List;

public class SumOfTwoSums {

    public static void main(String[]args) {
        int[] array1={1,2,3,4,5};
        int[] array2={6,7,8,9,10};

        System.out.println(getSum(array1,array2));

    }

    public static List getSum(int[] arr1,int[] arr2){

        int sum1=0;

        for(int i=0;i<arr1.length;i++){
            sum1+=arr1[i];
        }

        int sum2=0;
        for(int i=0;i<arr2.length;i++){
            sum2+=arr2[i];
        }
List<Integer> totalSum=new ArrayList<>();
        totalSum.add(sum1+sum2);

        return totalSum;
    }
}
