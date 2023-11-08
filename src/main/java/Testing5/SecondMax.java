package Testing5;

public class SecondMax {

    public static void main(String[] args) {


        int[] a={5,3,7,2,3};
        System.out.println(getSecond(a));

    }

    private static int getSecond(int[]num){

        int max=num[0];
        int second=num[0];

        for(int i=0;i<num.length;i++){
            if(max<num[i]) {
                second = max;
                max = num[i];
            }
                else if(second<num[i]&&second!=max){
                    second=num[i];
                }
            }
        return second;
        }

    }

