package by.epam.chef.test;

import by.epam.chef.entity.SideDish;
import by.epam.chef.exception.WrongInputException;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static by.epam.chef.factory.VegetableFactory.*;
import static by.epam.chef.logic.SideDishLogic.*;
import static org.junit.Assert.assertEquals;


/**
 * Created by Антон on 13.03.2017.
 */
@Ignore
public class SideDishLogicTest {
    private SideDish sideDish;

    @Before
    public void initialize() throws WrongInputException {
        sideDish = new SideDish();
        sideDish.addIngredient(getVegetableFromFactory(40, 100));
        sideDish.addIngredient(getVegetableFromFactory(15, 200));
    }

    @Test
    public void countCaloriesTest_Has95TotalCalories() throws WrongInputException {
        double calories = countCalories(sideDish);
        assertEquals(70, calories, 0.000001);
    }
}
