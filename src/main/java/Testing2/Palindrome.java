package Testing2;

public class Palindrome {

    public static void main(String[] args) {

        String textA= "sos";
        String textB="kknknkn";

        System.out.println(getText(textB));

    }



    public static boolean getText(String text){


        int i=0;

        int j=text.length()-1;

        while (j>i){
            if(text.charAt(j)==text.charAt(i)){
                System.out.println("Palindrome");



                return true;
            }
            else{
                System.out.println("not");
                return false;


            }
        }
        return true;
    }
}




