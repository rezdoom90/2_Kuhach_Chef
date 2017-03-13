package by.epam.chef.entity;

import by.epam.chef.exception.WrongInputException;

/**
 * Created by Антон on 07.03.2017.
 */
public class Dill extends LeafyVegetable{
    public Dill() throws WrongInputException {
        super("Dill", 40);
    }

    public Dill(double weight) throws WrongInputException {
        super("Dill", 40, weight);
    }
}
