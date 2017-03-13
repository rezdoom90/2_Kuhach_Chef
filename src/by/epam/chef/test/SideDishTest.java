package by.epam.chef.test;

import by.epam.chef.entity.Beet;
import by.epam.chef.entity.SideDish;
import by.epam.chef.exception.WrongInputException;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by Антон on 13.03.2017.
 */
public class SideDishTest {
    SideDish sideDish;

    @Test
    public void getIngredientsByCaloriesTest_NoMatch() {
        try {
            sideDish = new SideDish();
            sideDish.addIngredient(new Beet(100));
            assertTrue(sideDish.getIngredientsByCalories(1.0, 2.0).isEmpty());
        } catch (WrongInputException ex) {
            fail();
        }
    }

    @Test
    public void getIngredientsByCaloriesTest_HasMatch() {
        try {
            sideDish = new SideDish();
            sideDish.addIngredient(new Beet(100));
            assertFalse(sideDish.getIngredientsByCalories(5.0, 100.0).isEmpty());
        } catch (WrongInputException ex) {
            fail();
        }
    }
}
