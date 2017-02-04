package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Anna on 03.02.2017.
 */
public class Bouquet {
    private List<Component> components = new ArrayList<Component>();

    public List<Component> getComponent() {
        return components;
    }

    public boolean addComponents(Component component){
        return components.add(component);
    }

    public double bouquetCost() {
        double cost = 0.0;
        for (Component component : components) {
           cost += component.getCost();
        }
        return cost;
    }

    public void sortFlowersByFreshnessLevel() {
        Collections.sort(components, new FreshnessLevelComparator());
    }

    public void showFlowersByStemLength(int minLength, int maxLength) {
        int length;
        System.out.println("Цветы с длиной стебля от "
                + minLength + " см.  до " + maxLength + " см.: " );
        for (Component component : components) {
            length = component.getStemLength();
            if (length >= minLength && length <= maxLength) {
                System.out.println(component.getName() + ", "
                        + component.getStemLength() + " см.");
            }
        }
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "components=" + components +
                '}';
    }
}
