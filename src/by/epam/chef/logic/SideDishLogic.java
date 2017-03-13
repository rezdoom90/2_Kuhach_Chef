package by.epam.chef.logic;

import by.epam.chef.entity.SideDish;
import by.epam.chef.entity.Vegetable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.apache.logging.log4j.Level.INFO;

/**
 * Created by Антон on 12.03.2017.
 */
public class SideDishLogic {
    static Logger logger = LogManager.getLogger();
    public static double countCalories(SideDish sideDish) {
        double calories = 0.0;

        for (Vegetable vegetable : sideDish.getIngredients()) {
            calories += VegetableLogic.getTotalCalories(vegetable);
        }

        logger.log(INFO, "Counted calories successfully.");

        return calories;
    }
}
