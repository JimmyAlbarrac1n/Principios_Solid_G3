package Liskov;

public class Dog extends Animal implements WalkingAnimal {
    @Override
    public void walk() {
        System.out.println("Dog is walking.");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
    
}
