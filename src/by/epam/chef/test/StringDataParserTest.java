package by.epam.chef.test;

import by.epam.chef.parser.StringDataParser;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class StringDataParserTest {
    ArrayList<String> array;

    @Test
    public void testReadRecipe_HasNullInputArray () {
        try {
            StringDataParser.readRecipe(array);
            fail();
        } catch (NullPointerException e) {
            //Success
        }
    }

    @Test
    public void testReadRecipe_HasEmptyInputArray () {
        array = new ArrayList<>();
        assertTrue(StringDataParser.readRecipe(array).isEmpty());
    }

    @Test
    public void testReadRecipeName_HasNullInputArray () {
        try {
            StringDataParser.readRecipeName(array);
            fail();
        } catch (NullPointerException e) {
            //Success
        }
    }

    @Test
    public void testReadRecipeName_HasEmptyInputArray () {
        array = new ArrayList<>();
        assertTrue(StringDataParser.readRecipeName(array).isEmpty());
    }


}
