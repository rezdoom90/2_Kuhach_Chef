package by.epam.chef.entity;

import by.epam.chef.exception.WrongInputException;

import static by.epam.chef.entity.VegetableCategory.ROOT;

/**
 * Created by Антон on 07.03.2017.
 */
public class RootVegetable extends Vegetable {
    public RootVegetable(String name) throws WrongInputException {
        super(name);
        this.setCategory(ROOT);
    }

    public RootVegetable(String name, double calories) throws WrongInputException {
        super(name, calories);
        this.setCategory(ROOT);
    }

    public RootVegetable(String name, double calories, double weight) throws WrongInputException {
        super(name, calories, weight);
        this.setCategory(ROOT);
    }
}
