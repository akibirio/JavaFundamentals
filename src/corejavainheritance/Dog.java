package corejavainheritance;

public class Dog extends Animal{

    @Override  // using the @override annotation to tell the compiler that we are overriding a method
               // although the annotation isn't mandatory
    public void eat() {
        // overriding the eat method in Animal Super class
        System.out.println("I eat Dog's Food.");
        
    }

    public void bark(){
        System.out.println("Since I am a Dog, I can bark.");
    }
    
}
