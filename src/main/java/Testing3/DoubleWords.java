package Testing3;

import javax.swing.*;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class DoubleWords {





    public static void main(String[] args) throws Exception {

        String path = "C:\\practice\\words.txt";
        Set<Map.Entry<String,Integer>>key=getDouble(path);
        for(Map.Entry<String,Integer>k:key){
            if(k.getValue()>1){
                System.out.println(k.getKey()+":"+k.getValue());
            }
        }
    }

    private static Set<Map.Entry<String, Integer>> getDouble(String path) throws Exception {

        File file = new File(path);
        Scanner sc = new Scanner(file);
        Map<String, Integer> map = new HashMap<>();
        while (sc.hasNextLine()){
        String[] text=sc.nextLine().split(" ");
        for(String word:text){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        }

return map.entrySet();
    }
}