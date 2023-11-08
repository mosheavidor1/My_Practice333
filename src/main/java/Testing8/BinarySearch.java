package Testing8;

public class BinarySearch {

    public static void main(String[] args) {


int[] b= {1,5,9,30,45};
int value=9;
int index=searchNumber(b,value);
String syntax="is in the list and it is located on index number";

if(index==-1){
    System.out.println("Not found");
}else {
    System.out.println("Number"+" "+value +" "+syntax+" "+index );
}








    }

    private static int searchNumber(int[]arr,int value){

        int first=0;
        int last=arr.length-1;


        while (first<=last){
        int middle= first+(last-first)/2;

            if(arr[middle]==value){
                return middle;
            }else if(arr[middle]<value){
                first=middle+1;



            }else{
                last=middle-1;

            }


        }

        return -1;

    }
}
