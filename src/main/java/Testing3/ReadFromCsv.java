package Testing3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public  class ReadFromCsv {

    public static void main(String[] args) throws Exception {

        File file = new File("C:\\practice\\annual-enterprise-survey-2021-financial-year-provisional-csv.CSV.csv");

        Scanner scanner = new Scanner(file);

        Map<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();


        while (scanner.hasNextLine()) {
            String[] text = scanner.nextLine().split(",");
            //String colThree = text[2].replaceAll("[^\\d]", "");
            String colThree = text[2].replaceAll("[\\d+]", "");

            set.add(colThree);

            map.merge(colThree, 1, Integer::sum);
        }
        for (String s : set) {
            System.out.println(s + ":" + map.get(s));

        }

    }

}


































//public class ReadFromCsv {
//
//
//    public static void main(String[] args) {
//
//        String csvPath="C:\\practice\\annual-enterprise-survey-2021-financial-year-provisional-csv.CSV.csv";
//        String cvsSplit = ",";
//
//        Map<String, Integer> map = new HashMap<>();
//        Set<String> set = new HashSet<>();
//
//    File file = new File(csvPath);
//try {
//    Scanner scanner = new Scanner(file);
//
//    while (scanner.hasNextLine()){
//
//        String[] text=scanner.nextLine().split(cvsSplit);
//
//        String col3=text[2].replaceAll("[^\\d]", "");
//
//        set.add(col3);
//
//        map.merge(col3,1,Integer::sum);
//
//    }
//
//    scanner.close();
//
//
//
//
//}catch (FileNotFoundException e){
//
//    e.printStackTrace();
//
//
//}
//
//for(String key:set){
//
//    System.out.println(key+":"+map.get(key));
//}
//
//
//    }
//}
