package corejavaabstraction;

// subclass of Animal
/**
 * InnerAnimalAbstract
 */
public class DogExtendAnimal extends AnimalAbstract {
    // provide implementation of the abstract method
    @Override
    void makeSound() {
        System.out.println(" Bark Bark");        
    }
    
}