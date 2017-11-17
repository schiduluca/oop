package com.ipp.sckeedoo.abstractfactory.meal;


public class Spagetti implements Meal {
    @Override
    public void prepare() {
        System.out.println(this.getClass().getSimpleName() + " is prepared.");
    }
}
