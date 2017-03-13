package by.epam.chef.entity;

import by.epam.chef.exception.WrongInputException;

/**
 * Created by Антон on 07.03.2017.
 */
public class Cucumber extends FruitVegetable {
    public Cucumber() throws WrongInputException {
        super("Cucumber", 16);
    }

    public Cucumber(double weight) throws WrongInputException {
        super("Cucumber", 16, weight);
    }
}
