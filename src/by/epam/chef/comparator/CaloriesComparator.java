package by.epam.chef.comparator;

import by.epam.chef.entity.Vegetable;

/**
 * Created by Антон on 12.03.2017.
 */
public class CaloriesComparator implements java.util.Comparator<Vegetable> {
    public int compare(Vegetable vegetable1, Vegetable vegetable2) {
        return (int) (vegetable1.getCalories() - vegetable2.getCalories());
    }
}
