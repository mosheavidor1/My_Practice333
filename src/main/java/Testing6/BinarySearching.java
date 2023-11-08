package Testing6;


public class BinarySearching{

    public static void main(String[] args) {

       int[]b={2,4,6,8,9};
       int value=4;
       int index=numberExists(b,value);
       if(index==-1){
           System.out.println("Not exists");
       }else {
           System.out.println(value+" "+"Exists in the array"+" "+"on index"+" "+index);
       }

    }

    private static int numberExists(int[]arr,int value){

        int start=0;
        int end=arr.length-1;

        while (end>=start){
            int mid = start+(end-start)/2;
            if(arr[mid]==value){
                return mid;
            }else if(arr[mid]<value){
               start=mid+1;

            }else {
               end=mid-1;
            }

        }
        return -1;
    }
}