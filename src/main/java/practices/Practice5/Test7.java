package practices.Practice5;

public class Test7 {


    public static void main(String[] args) {

        String word = "Moshe Avidor";

        System.out.println(getNumOfLetters(word.toCharArray()));

    }


    public static String getNumOfLetters(char[] text) {

        String sum="";

        for(int i=0;i<text.length;i++){
            while (i<text.length&&text[i]!=' '){
                sum=sum+text[i];
                i++;
            }
            if(sum.length()>0){
                System.out.println(sum+":"+sum.length());
                sum="";
            }

            }
return sum;
        }
    }


