package by.epam.chef.entity;

/**
 * Created by Антон on 07.03.2017.
 */
public enum VegetableCategory {
    LEAF("leafy"), FRUIT("fruit"), ROOT("root");
    String name;

    VegetableCategory(String arg) {
        name = arg;
    }

    public String getName() {
        return name;
    }
}
