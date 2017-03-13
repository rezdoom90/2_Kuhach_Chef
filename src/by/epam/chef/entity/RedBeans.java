package by.epam.chef.entity;

import by.epam.chef.exception.WrongInputException;

/**
 * Created by Антон on 07.03.2017.
 */
public class RedBeans extends FruitVegetable {
    public RedBeans() throws WrongInputException {
        super("Red Beans", 93);
    }

    public RedBeans(double weight) throws WrongInputException {
        super("Red Beans", 93, weight);
    }
}
