package by.epam.chef.entity;

import by.epam.chef.exception.WrongInputException;

/**
 * Created by Антон on 07.03.2017.
 */
public class Beet extends RootVegetable {
    public Beet() throws WrongInputException {
        super("Beet", 43);
    }

    public Beet(double weight) throws WrongInputException {
        super("Beet", 43, weight);
    }
}
