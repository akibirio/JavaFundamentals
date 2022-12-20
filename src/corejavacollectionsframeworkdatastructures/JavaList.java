package corejavacollectionsframeworkdatastructures;

import java.util.ArrayList;
import java.util.List;

/**
 * JavaList
 */
public class JavaList {

    public static void main(String[] args) {
        //creating an unmodifiable List... this list is immutable, meaning we cannot add more elements to it
        List<String> colorsUnmodifiable = List.of(
            "Green",
            "Black"
        );

        List<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Yellow");        
        colors.add("Pink");
        System.out.println(colors);
        System.out.println("List size: " + colors.size());

       // There are thre ways to loop through the ArrayList
        System.out.println("Looping through the list using traditional for loop");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

        System.out.println();
        System.out.println("Looping through the list using enhanced for...each loop");
        for (String color : colors) {
            System.out.println(color);
        }

        System.out.println();
        System.out.println("Looping through the list using object.forEach method loop");
        colors.forEach(System.out::println);
        
        
        
        // accessing the unmodifiable list
        System.out.println();
        System.out.println("From Unmodifiable List :: ");
        System.out.println(colorsUnmodifiable.get(0));
    }
}