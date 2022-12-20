package corejavacollectionsframework;


import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {
    public static void main(String[] args) {

        Queue<Person> supermarketCustomers = new LinkedList<>();
        supermarketCustomers.add(new Person("Alex", 21));
        supermarketCustomers.add(new Person("Miriam", 18));
        supermarketCustomers.add(new Person("Ali", 40));

        //get the size of the queue.
        System.out.println("Size of Queue: " + supermarketCustomers.size());
        System.out.println("Who is at the Front: " + supermarketCustomers.peek());  // return an element and don't remove.
        System.out.println(supermarketCustomers.poll());  // return the front element and remove it.
        System.out.println("Size of Queue after Pool: " + supermarketCustomers.size());

        
    }

    // a record to define an Object that will be inserted in the queue
    static record Person(String name, int age) {
    }
    
}
