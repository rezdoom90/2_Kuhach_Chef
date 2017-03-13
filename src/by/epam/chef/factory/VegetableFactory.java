package by.epam.chef.factory;

import by.epam.chef.entity.*;
import by.epam.chef.exception.WrongInputException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.apache.logging.log4j.Level.ERROR;
import static org.apache.logging.log4j.Level.INFO;

/**
 * Created by Антон on 12.03.2017.
 */
public class VegetableFactory {
    static Logger logger = LogManager.getLogger();
    public static Vegetable getVegetableFromFactory (double calories, double weight) throws WrongInputException {
        Vegetable chosenVegetable;
        int intCal = (int)Math.round(calories);

        switch (intCal) {
            case 43:
                chosenVegetable = new Beet(weight);
                logger.log(INFO, "Got Beet from factory.");
                break;
            case 41:
                chosenVegetable = new Carrot(weight);
                logger.log(INFO, "Got Carrot from factory.");
                break;
            case 16:
                chosenVegetable = new Cucumber(weight);
                logger.log(INFO, "Got Cucumber from factory.");
                break;
            case 40:
                chosenVegetable = new Dill(weight);
                logger.log(INFO, "Got Dill from factory.");
                break;
            case 17:
                chosenVegetable = new Radish(weight);
                logger.log(INFO, "Got Radish from factory.");
                break;
            case 93:
                chosenVegetable = new RedBeans(weight);
                logger.log(INFO, "Got RedBeans from factory.");
                break;
            case 15:
                chosenVegetable = new Salad(weight);
                logger.log(INFO, "Got Salad from factory.");
                break;
            case 23:
                chosenVegetable = new Spinach(weight);
                logger.log(INFO, "Got Spinach from factory.");
                break;
            case 18:
                chosenVegetable = new Tomato(weight);
                logger.log(INFO, "Got Tomato from factory.");
                break;
            default:
                logger.log(ERROR, "Wrong input parameters for Vegetable!");
                throw new WrongInputException("Wrong input!");
        }

        return chosenVegetable;
    }
}
