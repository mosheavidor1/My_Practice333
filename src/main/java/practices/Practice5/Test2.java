package practices.Practice5;

public class Test2 {

    public static void main(String[] args) {

        int b[] = {5, 3, 50, 6, 7};
        System.out.println(getMax(b));


    }

    public static int getMax(int[] num) {

     int max=num[0];
     int second=num[0];

     for(int i=0;i<num.length;i++){

         if(num[i]>max) {
             second = max;
             max = num[i];
         }else if(num[i]>second&&num[i]!=max){
             second=num[i];
         }

         }
     return second;
     }
    }