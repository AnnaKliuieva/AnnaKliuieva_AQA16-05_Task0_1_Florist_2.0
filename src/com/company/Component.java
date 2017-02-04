package com.company;

/**
 * Created by Anna on 04.02.2017.
 */
abstract public class Component {
    protected String name;
    protected int freshnessLevel; // количество дней после срезания
    protected int stemLength;
    protected double cost;
    protected double accesslength; // в метрах
    protected double costByMetr;

    public Component(String name, double accesslength, double costByMetr) {
        this.name = name;
        this.accesslength = accesslength;
        this.costByMetr = costByMetr;
    }

    public Component(String name, int freshnessLevel, int stemLength, double cost) {
        this.name = name;
        this.freshnessLevel = freshnessLevel;
        this.stemLength = stemLength;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getFreshnessLevel() {
        return freshnessLevel;
    }

    public int getStemLength() {
        return stemLength;
    }

    public double getCost() {
        return cost;
    }

    public double getAccesslength() {
        return accesslength;
    }

    public double getCostByMetr() {
        return costByMetr;
    }

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", freshnessLevel=" + freshnessLevel +
                ", stemLength=" + stemLength +
                ", cost=" + cost +
                ", accesslength=" + accesslength +
                ", costByMetr=" + costByMetr +
                '}';
    }
}
