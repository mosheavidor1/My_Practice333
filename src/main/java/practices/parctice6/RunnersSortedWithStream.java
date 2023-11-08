package practices.parctice6;



import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RunnersSortedWithStream {

    public static void main(String[] args) {

        HashMap<String, Double> runnersInfo = new HashMap<>();

        runnersInfo.put("Moshe", 3.4);
        runnersInfo.put("Alex", 4.5);
        runnersInfo.put("Dave", 6.4);
        runnersInfo.put("Bob", 2.5);
        runnersInfo.put("Jack", 1.8);

        System.out.println(runners(runnersInfo));
    }




public static HashMap<String,Double>runners(HashMap<String,Double>runnersScores){

        LinkedHashMap<String,Double>sortedScores=runnersScores.entrySet().stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(oldValue,newValue)->oldValue,LinkedHashMap::new));

        runnersScores.forEach((name,score)->System.out.println(name+": "+score));

return sortedScores;
    }
}





