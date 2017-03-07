package by.epam.chef.entity;

/**
 * Created by Антон on 07.03.2017.
 */
public class Tomato extends FruitVegetable {
    public Tomato() {
        super("Tomato", 18);
    }

    public Tomato(double weight) {
        super("Tomato", 18, weight);
    }
}
