package Liskov;

public class Fish extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Fish makes blub blub sound.");
    }

}
