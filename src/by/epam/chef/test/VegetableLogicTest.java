package by.epam.chef.test;

import by.epam.chef.entity.Dill;
import by.epam.chef.entity.Vegetable;
import by.epam.chef.exception.WrongInputException;
import org.junit.Before;
import org.junit.Test;

import static by.epam.chef.logic.VegetableLogic.getTotalCalories;
import static org.junit.Assert.assertEquals;

/**
 * Created by Антон on 13.03.2017.
 */
public class VegetableLogicTest {
    Vegetable vegetable;

    @Before
    public void initialize() throws WrongInputException {
        vegetable = new Dill(500);
    }

    @Test
    public void getTotalCaloriesTest() {
        double actualValue = getTotalCalories(vegetable);
        assertEquals(200, actualValue, 0.000001);
    }
}
