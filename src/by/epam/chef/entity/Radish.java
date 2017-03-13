package by.epam.chef.entity;

import by.epam.chef.exception.WrongInputException;

/**
 * Created by Антон on 07.03.2017.
 */
public class Radish extends RootVegetable {
    public Radish() throws WrongInputException {
        super("Radish", 17);
    }

    public Radish(double weight) throws WrongInputException {
        super("Radish", 17, weight);
    }
}
