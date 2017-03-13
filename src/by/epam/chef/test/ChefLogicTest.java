package by.epam.chef.test;

import by.epam.chef.entity.*;
import by.epam.chef.exception.MissingFileException;
import by.epam.chef.exception.WrongInputException;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Map;

import static by.epam.chef.logic.ChefLogic.prepareSideDish;
import static by.epam.chef.parser.StringDataParser.readRecipe;
import static by.epam.chef.parser.StringDataParser.readRecipeName;
import static by.epam.chef.reader.InputFileDataReader.getFileData;
import static org.junit.Assert.assertFalse;


/**
 * Created by Антон on 13.03.2017.
 */
public class ChefLogicTest {
    Chef chef;

    @Before
    public void initialize() throws WrongInputException, MissingFileException {
        chef = new Chef("Вася");
        ArrayList<String> data = getFileData("");
        String recipeName = readRecipeName(data);
        Map<Double, Double> recipe = readRecipe(data);

        chef.setSideDish(prepareSideDish(recipeName, recipe));
    }

    @Test
    public void prepareSideDishTest_PreparedSuccessfully() {
        assertFalse(chef.getSideDish().getIngredients().isEmpty());
    }
}
