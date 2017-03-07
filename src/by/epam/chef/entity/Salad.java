package by.epam.chef.entity;

/**
 * Created by Антон on 07.03.2017.
 */
public class Salad extends LeafyVegetable {
    public Salad() {
        super("Salad", 15);
    }

    public Salad(double weight) {
        super("Salad", 15, weight);
    }
}
