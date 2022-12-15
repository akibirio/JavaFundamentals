package corejavaabstraction;

/**
 * AnimalAbstract
 */
abstract class AnimalAbstract {
    abstract void makeSound();    // abstract methods do not have a body

    // normal method
    public void eat() {
        System.out.println("I can eat");
    }
    
}
