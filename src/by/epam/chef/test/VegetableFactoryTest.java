package by.epam.chef.test;

import by.epam.chef.entity.Vegetable;
import by.epam.chef.exception.WrongInputException;
import org.junit.Test;

import static by.epam.chef.factory.VegetableFactory.getVegetableFromFactory;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by Антон on 13.03.2017.
 */
public class VegetableFactoryTest {
    Vegetable vegetable;

    @Test
    public void getVegetableFromFactoryTest_ThereIsNoSuchCaloryVegetable() {
        try {
            vegetable = getVegetableFromFactory(11, 600);
        } catch (WrongInputException ex) {
            //Success
        }
    }

    @Test
    public void getVegetableFromFactoryTest_GetTomato() {
        try {
            vegetable = getVegetableFromFactory(18, 600);
        } catch (WrongInputException ex) {
            fail();
        }
        assertTrue(vegetable.getName().equals("Tomato"));
    }
}
