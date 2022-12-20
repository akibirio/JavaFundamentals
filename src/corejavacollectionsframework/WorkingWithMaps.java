package corejavacollectionsframework;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();

        //insert into map
        map.put(1,  new Person("Ayub"));
        map.put(2,  new Person("Alex"));
        map.put(3,  new Person("Maraim"));

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());

        /// lloop through
        map.entrySet().forEach(System.out::println);
        /// lloop through with lambda
        System.out.println("loop through with lambda :: ");
        map.entrySet().forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));

        /// lloop through with lambda option 2
        map.forEach((key, value) -> {
                System.out.println(key + " - " + value);
        });
        
    }

    public record Person(String name) {
            
    }
    
}
