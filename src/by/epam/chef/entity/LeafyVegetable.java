package by.epam.chef.entity;

import static by.epam.chef.entity.VegetableCategory.LEAF;

/**
 * Created by Антон on 07.03.2017.
 */
public class LeafyVegetable extends Vegetable {
    public LeafyVegetable(String name) {
        super(name);
        this.setCategory(LEAF);
    }

    public LeafyVegetable(String name, double calories) {
        super(name, calories);
        this.setCategory(LEAF);
    }

    public LeafyVegetable(String name, double calories, double weight) {
        super(name, calories, weight);
        this.setCategory(LEAF);
    }
}
