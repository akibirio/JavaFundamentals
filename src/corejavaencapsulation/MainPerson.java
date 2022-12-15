package corejavaencapsulation;

public class MainPerson {

    public static void main(String[] args) {
        
        // create an object of person
        Person baby = new Person();

        //change age using setter
        baby.setAge(4);

        // access age using getter
        System.out.println("Baby's Age is : " + baby.getAge());

    }
    
}
