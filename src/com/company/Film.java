package com.company;

/**
 * Created by Anna on 03.02.2017.
 */
public class Film extends Accessory {

    private final static String name = "Пленка";
    private final static double costByMetr = 2;

    public Film(double accesslength) {
        super(name, accesslength, costByMetr);
    }
}
