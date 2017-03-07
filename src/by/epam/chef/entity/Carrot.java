package by.epam.chef.entity;

/**
 * Created by Антон on 07.03.2017.
 */
public class Carrot extends RootVegetable {
    public Carrot() {
        super("Carrot", 41);
    }

    public Carrot(double weight) {
        super("Carrot", 41, weight);
    }
}
