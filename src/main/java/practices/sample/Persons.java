package practices.sample;

public class Persons {

private String name;

private int age;

private Gender gender;

public Persons(String name,int age,Gender gender){
this.age=age;
this.name=name;
this.gender=gender;
}

public String getName(){
    return name;
}
public int getAge(){
    return age;
}
public Gender getGender(){
    return gender;
}

public String toString(){

    return name+"("+age+")";
}

}