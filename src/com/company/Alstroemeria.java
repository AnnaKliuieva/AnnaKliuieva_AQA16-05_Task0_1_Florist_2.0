package com.company;

/**
 * Created by Anna on 03.02.2017.
 */
public class Alstroemeria extends Flower {

    private double alstroemeriaCost;
    private final static String name = "Альстромерия";
    private final static double cost = 25;

    public Alstroemeria(int freshnessLevel, int stemLength) {
        super(name, freshnessLevel, stemLength, cost);
    }

    @Override
    public double getFinalCost() {
        switch (this.getFreshnessLevel())
        {
            case 1:
                alstroemeriaCost = cost;
                break;
            case 2:
                alstroemeriaCost = cost - 3;
                break;
            case 3:
                alstroemeriaCost = cost - 6;
                break;
        };
        return alstroemeriaCost;
    }
}
