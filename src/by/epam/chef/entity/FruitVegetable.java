package by.epam.chef.entity;

import static by.epam.chef.entity.VegetableCategory.FRUIT;

/**
 * Created by Антон on 07.03.2017.
 */
public class FruitVegetable extends Vegetable {
    public FruitVegetable(String name) {
        super(name);
        this.setCategory(FRUIT);
    }

    public FruitVegetable(String name, double calories) {
        super(name, calories);
        this.setCategory(FRUIT);
    }

    public FruitVegetable(String name, double calories, double weight) {
        super(name, calories, weight);
        this.setCategory(FRUIT);
    }
}
