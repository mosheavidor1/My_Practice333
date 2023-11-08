package practices.practice;

import practices.practice2.SortingParameters;

import java.util.*;

public class UsingSort {


    public static void main(String[] args) {


        List<Integer>numbers=new ArrayList<>();

        numbers.add(3);
        numbers.add(2);
        numbers.add(1);


        List<Info> run=runnersInfo();

        Comparator<SortingParameters>ageInfo;








    }


    public static List<Info>runnersInfo(){

        List<Info>runners=new ArrayList<>();

        runners.add(new Info("Moshe",35));
        runners.add(new Info("Bill",20));
        runners.add(new Info("Bob",30));
        runners.add(new Info("Mike",45));
        System.out.println(runners);

return runners;
    }

}





