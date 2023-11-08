package practices.Practice5;

public class Test3 {


    public static void main(String[] args) {


        String text="jdjdjdjhuhuhulrljjo";

        int i=0;
        int j=text.length()-1;

        while (j>i){
            if(text.charAt(i)==text.charAt(j)){
                System.out.println("Palindrome");
                break;
            }
            else {

                System.out.println("not");
                break;
            }

        }
    }
}
