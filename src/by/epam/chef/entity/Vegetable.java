package by.epam.chef.entity;

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

    public Vegetable(String name, double calories) {
        if (calories < 0) {
            throw new IllegalArgumentException("Cannot create vegetable with "
                    + calories + "kcal");
        }

        this.name = name;
        this.calories = calories;
    }

    public Vegetable(String name, double calories, double weight) {
        if (calories < 0) {
            throw new IllegalArgumentException("Cannot create vegetable with "
                    + calories + "kcal!");
        }

        if (weight < Double.MIN_NORMAL) {
            throw new IllegalArgumentException("Cannot create " + weight
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
        final StringBuffer sb = new StringBuffer("Vegetable{");
        sb.append(name);
        sb.append(" is a ").append(category.getName());
        sb.append(" vegetable, ").append(calories);
        sb.append(" kcal per 100g, weight is ").append(weight);
        sb.append("g.");
        sb.append('}');
        return sb.toString();
    }
}
