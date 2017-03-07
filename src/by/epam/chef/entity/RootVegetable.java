package by.epam.chef.entity;

import static by.epam.chef.entity.VegetableCategory.ROOT;

/**
 * Created by Антон on 07.03.2017.
 */
public class RootVegetable extends Vegetable {
    public RootVegetable(String name) {
        super(name);
        this.setCategory(ROOT);
    }

    public RootVegetable(String name, double calories) {
        super(name, calories);
        this.setCategory(ROOT);
    }

    public RootVegetable(String name, double calories, double weight) {
        super(name, calories, weight);
        this.setCategory(ROOT);
    }
}
