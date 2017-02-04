package com.company;

/**
 * Created by Anna on 03.02.2017.
 */
public class Rose extends Flower{

    private double roseCost;
    private final static String name = "Роза";
    private final static double cost = 35;

    public Rose(int freshnessLevel, int stemLength) {
        super(name, freshnessLevel, stemLength, cost);
    }

    @Override
    public double getFinalCost() {
        switch (this.getFreshnessLevel())
        {
            case 1:
                roseCost = cost;
                break;
            case 2:
                roseCost = cost - 2;
                break;
            case 3:
                roseCost = cost - 4;
                break;
        };
        return roseCost;
    }
}
