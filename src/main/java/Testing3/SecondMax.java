package Testing3;


public class SecondMax{

public static void main(String[]args){

    int[] b={5,17,9,2,30};

    System.out.println(getSecond(b));

        }


 private static int getSecond(int[] num){

    int max=num[0];
    int second=num[0];

    for(int i=0;i<num.length;i++){

        if(max<num[i]){
        second=max;
        max=num[i];
        if(num[i]>second&&second!=max){
            num[i]=second;
        }
        }
    }
    return second;

        }
        }





//public class SecondMax {
//
//    public static void main(String[] args) {
//
//        int[] b = {5, 4, 6, 77, 88, 9};
//
//        System.out.println(getSecond(b));
//    }
//
//    public static int getSecond(int[] num) {
//
//        int max = num[0];
//        int second = num[0];
//        for (int i = 0; i < num.length; i++) {
//            if (max < num[i]) {
//                second = max;
//                max = num[i];
//
//            } else if (num[i] > second && num[i] < max) {
//                second = num[i];
//            }
//
//        }
//        return second;
//    }
//}
