package by.epam.chef.logic;

import by.epam.chef.entity.Vegetable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.apache.logging.log4j.Level.INFO;

/**
 * Created by Антон on 12.03.2017.
 */
public class VegetableLogic {
    static Logger logger = LogManager.getLogger();
    public static double getTotalCalories(Vegetable vegetable) {
        double totalCalories = vegetable.getWeight() * vegetable.getCalories() / 100;

        logger.log(INFO, "Received total calories successfully.");

        return totalCalories;
    }
}
