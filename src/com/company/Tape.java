package com.company;

/**
 * Created by Anna on 03.02.2017.
 */
public class Tape extends Accessory {

    private final static String name = "Лента";
    private final static double costByMetr = 1.5;

    public Tape(double accesslength) {
        super(name, accesslength, costByMetr);
    }
}
