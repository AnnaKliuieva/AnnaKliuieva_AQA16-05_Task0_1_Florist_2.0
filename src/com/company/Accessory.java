package com.company;

/**
 * Created by Anna on 03.02.2017.
 */
public class Accessory extends Component{

    public Accessory(String name, double accesslength, double costByMetr) {
        super(name, accesslength, costByMetr);
    }

    public double getTotalCost(){
        return accesslength * costByMetr;
    }

    @Override
    public String toString() {
        return "Аксессуар " + name + " стоимостью " + getTotalCost() + " грн.";
    }
}
