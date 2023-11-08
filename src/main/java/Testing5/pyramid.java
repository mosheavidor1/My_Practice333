package Testing5;

public class pyramid {;

    public static void main(String[] args) {


        System.out.println(getPyramid(6));

    }

    private static int getPyramid(int size){
        int num1=1;
        System.out.println(num1);
        size=6;
        int sum=0;
        int k=2;


        for(int i=3;i<size;i++,sum++){
            sum=k+(k+1);

         for (int j=2;j<=i;j++,k++){
             System.out.print(k+" ");
         }

sum=k;
            System.out.println(sum);

        }
        return sum;
    }
}
