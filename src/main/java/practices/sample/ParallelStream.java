package practices.sample;

import java.util.*;

public class ParallelStream {

    public static void main(String[] args) {

        List<Persons>womanUnder40=new ArrayList<>();
        List<Persons>womanOver40=new ArrayList<>();
        List<Persons>manUnder40=new ArrayList<>();
        List<Persons>manOver40=new ArrayList<>();

        getPerson().stream().parallel().forEach(persons->{
            if(persons.getGender()==Gender.FEMALE&&persons.getAge()>40){
                womanOver40.add(persons);
            }else if(persons.getGender()==Gender.MALE&&persons.getAge()<40){
                manUnder40.add(persons);
            }
        });

        Collections.sort(womanOver40, Comparator.comparing(Persons::getAge));
        Collections.sort(manUnder40, Comparator.comparing(Persons::getName));

        System.out.println("Woman over 40 :");
        womanOver40.forEach(System.out::println);
        System.out.println("\nMen under 40 :");
        manUnder40.forEach(System.out::println);





    }





    private static List<Persons>getPerson(){

        return List.of(new Persons("Moshe",39,Gender.MALE),
                        new Persons("Tamar",12,Gender.FEMALE),
                        new Persons("Jack",45,Gender.MALE),
                        new Persons("Sarah",42,Gender.FEMALE),
                         new Persons("Bob",16,Gender.MALE));

    }
}
