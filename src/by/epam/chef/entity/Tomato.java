package by.epam.chef.entity;

import by.epam.chef.exception.WrongInputException;

/**
 * Created by Антон on 07.03.2017.
 */
public class Tomato extends FruitVegetable {
    public Tomato() throws WrongInputException {
        super("Tomato", 18);
    }

    public Tomato(double weight) throws WrongInputException {
        super("Tomato", 18, weight);
    }
}
