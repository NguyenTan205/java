package animal;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "animal.Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
