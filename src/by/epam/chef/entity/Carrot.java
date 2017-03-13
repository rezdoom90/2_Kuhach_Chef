package by.epam.chef.entity;

import by.epam.chef.exception.WrongInputException;

/**
 * Created by Антон on 07.03.2017.
 */
public class Carrot extends RootVegetable {
    public Carrot() throws WrongInputException {
        super("Carrot", 41);
    }

    public Carrot(double weight) throws WrongInputException {
        super("Carrot", 41, weight);
    }
}
