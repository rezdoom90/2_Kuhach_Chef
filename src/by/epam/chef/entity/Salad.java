package by.epam.chef.entity;

import by.epam.chef.exception.WrongInputException;

/**
 * Created by Антон on 07.03.2017.
 */
public class Salad extends LeafyVegetable {
    public Salad() throws WrongInputException {
        super("Salad", 15);
    }

    public Salad(double weight) throws WrongInputException {
        super("Salad", 15, weight);
    }
}
