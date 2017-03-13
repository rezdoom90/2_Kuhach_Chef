package by.epam.chef.entity;

import by.epam.chef.exception.WrongInputException;

import static by.epam.chef.entity.VegetableCategory.LEAF;

/**
 * Created by Антон on 07.03.2017.
 */
public class LeafyVegetable extends Vegetable {
    public LeafyVegetable(String name) {
        super(name);
        this.setCategory(LEAF);
    }

    public LeafyVegetable(String name, double calories) throws WrongInputException {
        super(name, calories);
        this.setCategory(LEAF);
    }

    public LeafyVegetable(String name, double calories, double weight) throws WrongInputException {
        super(name, calories, weight);
        this.setCategory(LEAF);
    }
}
