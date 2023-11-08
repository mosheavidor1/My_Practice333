package Testing6;

import java.io.File;
import java.util.*;

public class ReadFromCsv{


    public static void main(String[]args)throws Exception{


        File file = new File("C:\\practice\\annual-enterprise-survey-2021-financial-year-provisional-csv.CSV.csv");

        Scanner sc = new Scanner(file);

        Map<String,Integer> map=new HashMap<>();

        Set<String> set=new HashSet<>();

        while(sc.hasNextLine()){

        String[]words=sc.nextLine().split(",");

        String columnThree=words[2].replaceAll("[\\d+]","");//leave only the letters;
            //String columnThree=words[2].replaceAll("[^\\d]",""); leave only the numbers;

        set.add(columnThree);

        map.merge(columnThree,1,Integer::sum);


        }


        for(String k:set){

        System.out.println(k+":"+map.get(k));

        }

    }
}


