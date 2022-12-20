package corejavacollectionsframeworkdatastructures;

import java.util.Stack;

public class JavaStack {
    public static void main(String[] args) {
        Stack<Integer> stackOfNumbers = new Stack<>();

        //adding numbers into a stack:
        stackOfNumbers.push(2);
        stackOfNumbers.push(7);
        stackOfNumbers.push(5);
        stackOfNumbers.push(4);

        System.out.println(stackOfNumbers);

        // removing the items Last in First Out.
        stackOfNumbers.pop();
        stackOfNumbers.pop();
        System.out.println(stackOfNumbers);

        // Checking for the item at the Top of the Stack, this doesnt remove the item
        System.out.println("Item at the Top: " + stackOfNumbers.peek());
    }
}
