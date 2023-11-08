package Testing1;

import java.util.HashMap;
import java.util.Map;

public class UserData {



    public Map<String,Integer> info(){

        Map<String, Integer> users = new HashMap<String, Integer>();

        users.put("Moshe",5);
        users.put("Danny",1);
        users.put("Bob",7);
        users.put("Mike",2);
        users.put("Jack",4);


          for(Map.Entry<String,Integer>user:users.entrySet()){
              System.out.println(users.keySet()+":"+users.values());
        }
return users;
    }

}



