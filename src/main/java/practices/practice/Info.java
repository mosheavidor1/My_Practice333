package practices.practice;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Info {

     String name;

     int age;

    @Override
    public String toString() {
        return "Info{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Info(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name=name;
}
public String getName(){

        return name;
}

    public  int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}