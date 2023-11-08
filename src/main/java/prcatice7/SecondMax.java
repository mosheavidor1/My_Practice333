package prcatice7;

public class SecondMax {


    public static void main(String[] args) {

        int[] b={5,3,2,7,1};
        System.out.println(getSecond(b));
    }

    private static int getSecond(int[]arr){

        int max=arr[0];
        int second=arr[0];

        for(int i=0;i<arr.length;i++){

            if(arr[i]>max){
                second=max;
                max=arr[i];

            }else if(second<arr[i]&&second!=max){
                second=arr[i];
            }
        }
        return second;
    }
}
