package com.company;

import java.util.Comparator;

/**
 * Created by Anna on 03.02.2017.
 */
public class FreshnessLevelComparator implements Comparator<Component>{
    @Override
    public int compare(Component component1, Component component2) {
        return (component1.getFreshnessLevel() - component2.getFreshnessLevel());
    }
}
