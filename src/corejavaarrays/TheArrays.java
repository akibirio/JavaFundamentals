package corejavaarrays;

import java.util.Arrays;

public class TheArrays{
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        // defining new array, an array of strings;
        String[] colors = new String[5];

        // adding elemnts into the array
        colors[0] = "red";
        colors[1] = "purple";
        
        System.out.println();
        System.out.println("Printing the array and 1 item using the index :::");
        System.out.println("Arrays : " + Arrays.toString(colors));
        System.out.println("Arrays : " + colors[4]);
        System.out.println();


        // another way of defining and initializing an array , when you know the number of items you have
        int[] numbers = {300, 400, 100, 500, 200};

        //how to loop arrays:
        // traditional for loop
        System.out.println("Looping through an array using traditional for loop ::: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            
        }

        System.out.println();
        System.out.println("Looping through an array using enhanced for...each loop ::: ");
        for (int i : numbers) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Looping through an array using Arrays Stream and foreach ::: ");
        Arrays.stream(colors).forEach(System.out::println);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }

}
