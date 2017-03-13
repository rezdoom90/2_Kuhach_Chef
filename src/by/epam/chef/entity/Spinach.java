package by.epam.chef.entity;

import by.epam.chef.exception.WrongInputException;

/**
 * Created by Антон on 07.03.2017.
 */
public class Spinach extends LeafyVegetable {
    public Spinach() throws WrongInputException {
        super("Spinach", 23);
    }

    public Spinach(double weight) throws WrongInputException {
        super("Spinach", 23, weight);
    }
}
