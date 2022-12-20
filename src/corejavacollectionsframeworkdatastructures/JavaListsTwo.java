package corejavacollectionsframeworkdatastructures;

import java.util.ArrayList;
import java.util.List;;

/**
 * JavaListsTwo
 */
public class JavaListsTwo {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <= 100; i++) {
            numbers.add(i);
        }

        for (Integer number : numbers) {
           
            System.out.print(number);
            if(number < 100){System.out.print(", ");}
        }
    }
}