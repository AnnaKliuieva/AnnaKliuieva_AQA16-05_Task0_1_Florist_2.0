package com.company;

/**
 * Created by Anna on 03.02.2017.
 */
public class Lily extends Flower {

    private double lilyCost;
    private final static String name = "Лилия";
    private final static double cost = 30;

    public Lily(int freshnessLevel, int stemLength) {
        super(name, freshnessLevel, stemLength, cost);
    }

    @Override
    public double getFinalCost() {
        switch (this.getFreshnessLevel()) {
            case 1:
                lilyCost = cost;
                break;
            case 2:
                lilyCost = cost - 3;
                break;
            case 3:
                lilyCost = cost - 5;
                break;
        }
        ;
        return lilyCost;
    }
}
