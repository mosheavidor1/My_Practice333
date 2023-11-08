package Testing6;

public class RegexPractice {

    public static void main(String[] args) {


        String text="abc123def456ghi789";
        String trimLetters=text.replaceAll("[^\\d]","");
        String trimNumbers=text.replaceAll("[\\d+]","");

        System.out.println(trimLetters);
        System.out.println(trimNumbers);
    }

}