package by.epam.chef.logic;

import by.epam.chef.entity.SideDish;
import by.epam.chef.exception.WrongInputException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Iterator;
import java.util.Map;

import static by.epam.chef.factory.VegetableFactory.getVegetableFromFactory;
import static org.apache.logging.log4j.Level.INFO;

/**
 * Created by Антон on 07.03.2017.
 */
public class ChefLogic {
    static Logger logger = LogManager.getLogger();
    public static SideDish prepareSideDish (String name, Map<Double, Double> recipe) throws WrongInputException {
        SideDish sideDish = new SideDish(name);

        Iterator<Map.Entry<Double, Double>> iterator = recipe.entrySet().iterator();

        while (iterator.hasNext())
        {
            Map.Entry<Double, Double> pair = iterator.next();
            double key = pair.getKey();
            double value = pair.getValue();
            sideDish.addIngredient(getVegetableFromFactory(key, value));
        }

        logger.log(INFO, "SideDish prepared successfully.");

        return sideDish;
    }
}
