package by.epam.chef.entity;

import by.epam.chef.exception.WrongInputException;

/**
 * Created by Антон on 07.03.2017.
 */
abstract public class Vegetable {
    private String name;
    private VegetableCategory category;
    private double calories; //kcal per 100g of weight
    private double weight; //grams

    public Vegetable(String name) {
        this.name = name;
    }

    public Vegetable(String name, double calories) throws WrongInputException {
        if (calories < 0) {
            throw new WrongInputException("Cannot create vegetable with "
                    + calories + "kcal");
        }

        this.name = name;
        this.calories = calories;
    }

    public Vegetable(String name, double calories, double weight) throws WrongInputException {
        if (calories < 0) {
            throw new WrongInputException("Cannot create vegetable with "
                    + calories + "kcal!");
        }

        if (weight < Double.MIN_NORMAL) {
            throw new WrongInputException("Cannot create " + weight
                    + "g of " + name + "!");
        }

        this.name = name;
        this.calories = calories;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public VegetableCategory getCategory() {
        return category;
    }

    public double getCalories() {
        return calories;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(VegetableCategory category) {
        this.category = category;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(weight).append(" grams of ");
        sb.append(category.getName()).append(" ");
        sb.append(name).append(", ");
        sb.append(calories).append(" kcal per 100g. ");
        return sb.toString();
    }
}
