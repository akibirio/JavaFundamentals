package corejavacollectionsframeworkdatastructures;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JavaSets {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(2);

        Iterator<Integer> iterate = numbers.iterator();
        while (iterate.hasNext()) {
            System.out.println(iterate.next());            
        }
    }
    
}
