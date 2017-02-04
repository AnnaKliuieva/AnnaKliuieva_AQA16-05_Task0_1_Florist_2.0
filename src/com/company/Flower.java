package com.company;

/**
 * Created by Anna on 03.02.2017.
 */
public class Flower extends Component {

    protected double finalCost;

    public Flower(String name, int freshnessLevel, int stemLength, double cost) {
        super(name, freshnessLevel, stemLength, cost);
    }

    public double getFinalCost() {
        switch (this.getFreshnessLevel())
        {
            case 1:
                finalCost = cost;
                break;
            case 2:
                finalCost = cost - 1;
                break;
            case 3:
                finalCost = cost - 2;
                break;
        };
        return finalCost;
    }

    @Override
    public String toString() {
        return name + " срезанная " + freshnessLevel + " день/дня назад. Длина стебля составляет "
                + stemLength + " см. Стоимость -- " + getFinalCost() + " грн.";

    }
}

