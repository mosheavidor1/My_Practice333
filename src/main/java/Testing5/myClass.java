package Testing5;

public class myClass {

    public static void main(String[] args) {

        int[] arr={2,5,7,8,6,50};

        System.out.println(getSecondMax(arr));


        }

    public static int getSecondMax(int[]num){

        int max=num[0];
        int second=num[0];
        for(int i=0;i<num.length;i++){
            if(max<num[0]){
            max=num[0];
            second=max;


            } else if (second<num[0]&&second!=max) {
                second=num[0];
            }



        }
        return second;
    }
}
