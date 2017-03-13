package by.epam.chef.parser;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.apache.logging.log4j.Level.INFO;


public class StringDataParser {
    static Logger logger = LogManager.getLogger();

    public static Map<Double, Double> readRecipe (ArrayList<String> stringData) {
        Map<Double, Double> recipe = new HashMap<>();

        Pattern p = Pattern.compile("\\d+\\.\\d+");
        double key = 0.0;
        double value;
        for (String s : stringData) {
            Matcher m = p.matcher(s);
            while (m.find()) {
                if(key == 0.0){
                    key = Double.parseDouble(m.group());
                } else {
                    value = Double.parseDouble(m.group());
                    recipe.put(key, value);
                    key = 0.0;
                }
            }
        }

        logger.log(INFO, "String data parsing done. Recipe received.");

        return recipe;
    }

    public static String readRecipeName (ArrayList<String> stringData) {
        String name = "";

        Pattern p = Pattern.compile("\"\\w+\"");
        for (String s : stringData) {
            Matcher m = p.matcher(s);
            while (m.find()) {
                name = m.group();
            }
        }

        logger.log(INFO, "String data parsing done. Recipe name received.");

        return name;
    }
}
