package com.company;

/**
 * Created by Anna on 03.02.2017.
 */
public class Paper extends Accessory {

    private final static String name = "Бумага";
    private final static double costByMetr = 3;

    public Paper(double accesslength) {
        super(name, accesslength, costByMetr);
    }
}
