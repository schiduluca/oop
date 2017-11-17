package com.ipp.sckeedoo.abstractfactory.meal;


public class Burger implements Meal {
    @Override
    public void prepare() {
        System.out.println(this.getClass().getSimpleName() + " is prepared.");
    }
}
