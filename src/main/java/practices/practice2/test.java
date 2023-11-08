package practices.practice2;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {


//Print the list:
        SortedList.listInfo();

        //Sorted linked list by using Collection.sort

        Collections.sort(SortedList.listInfo());

        //Sorted linked list by using Collection.sort Descending -Reversed list.
        Collections.sort(SortedList.listInfo(), Collections.reverseOrder());
        System.out.println(SortedList.listInfo());





        //Stream Sorted Linked List

        System.out.println(SortedList.listInfo().stream().sorted().collect(Collectors.toList()));





        //Sort Linked List  with Comparator (using the sorting Parameters class):

        List<SortingParameters>scoresResults=sortingParameters();
        Comparator<SortingParameters>compareScores=new Comparator<SortingParameters>() {
            @Override
            public int compare(SortingParameters o1, SortingParameters o2) {
                if(o1.getScore()>o2.getScore()){
                    return 1;
                }else if(o1.getScore()<o2.getScore()){
                    return -1;
                }
                else {
                    return 0;
                }

            }
        };

scoresResults.sort(compareScores);
        System.out.println(scoresResults);


//Sorted List of Linked List using Comparator with Lambdas .

        Comparator<SortingParameters>ScoresLambdas=(a,b)->Double.compare(a.getScore(),b.getScore());
        scoresResults.sort(ScoresLambdas);
        System.out.println(scoresResults);



//Sorted List of Linked List using Compartor with Lambdas and Double colons;

        ScoresLambdas=Comparator.comparingDouble(SortingParameters::getScore);
        scoresResults.sort(ScoresLambdas);
        System.out.println(scoresResults);

}

    public static List<SortingParameters>sortingParameters(){

        List<SortingParameters>scores=new LinkedList<>();
        scores.add(new SortingParameters("Moshe",3.5));
        scores.add(new SortingParameters("Alex",5.5));
        scores.add(new SortingParameters("Jim",1.5));
        scores.add(new SortingParameters("Ben",8.5));
        scores.add(new SortingParameters("Bob",4.8));
        System.out.println(scores);
        return scores;
    }
}