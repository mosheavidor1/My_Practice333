package Testing3;

public class Palindrome {

    public static void main(String[] args) {

String word="sos";

        System.out.println(isPalindrome(word));

    }


    private static boolean isPalindrome(String text) {

int i=0;
int j=text.length()-1;

while (j>i){
    if(text.charAt(j)!=text.charAt(i)){
        System.out.println("Not palindrome");

        return false;


    }else {

        System.out.println("palindrome");
        return true;

    }
}

  return true;

    }
}
