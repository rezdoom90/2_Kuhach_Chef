package by.epam.chef.entity;

import by.epam.chef.comparator.CaloriesComparator;
import by.epam.chef.comparator.WeightComparator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.apache.logging.log4j.Level.INFO;

/**
 * Created by Антон on 07.03.2017.
 */
public class SideDish {
    static Logger logger = LogManager.getLogger();
    private String name;
    private List<Vegetable> ingredients = new ArrayList<Vegetable>();

    public SideDish() {
        name = "unnamed";
        logger.log(INFO, "SideDish created successfully.");
    }

    public SideDish(String name) {
        this.name = name;
        logger.log(INFO, "SideDish created successfully.");
    }

    public String getName() {
        return name;
    }

    public List<Vegetable> getIngredients() {
        return ingredients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addIngredient(Vegetable vegetable) {
        return ingredients.add(vegetable);
    }

    public String getIngredientsByCalories(double fromCalories, double toCalories) {
        StringBuffer sb = new StringBuffer();

        for (Vegetable vegetable : ingredients) {
            double calories = vegetable.getCalories();
            if (calories >= fromCalories && calories <= toCalories) {
                sb.append(vegetable.getName() + " has "
                        + vegetable.getCalories() + " kcal per 100g. ");
            }
        }

        logger.log(INFO, "Ingredients picked successfully.");

        return sb.toString();
    }

    public void sortIngredientsByCalories() {
        Collections.sort(ingredients, new CaloriesComparator());

        logger.log(INFO, "Ingredients sorted by calories successfully.");
    }

    public void sortIngredientsByWeight() {
        Collections.sort(ingredients, new WeightComparator());

        logger.log(INFO, "Ingredients sorted by weight successfully.");
    }

    public void sortIngredientsByWeightAndCalories() {
        Collections.sort(ingredients, new WeightComparator());
        Collections.sort(ingredients, new CaloriesComparator());

        logger.log(INFO, "Ingredients sorted by weight and calories successfully.");
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(name);
        sb.append(" side dish consists of: ");
        for(Vegetable vegetable : ingredients) {
            sb.append(vegetable.toString());
        }
        return sb.toString();
    }
}