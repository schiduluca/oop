package com.ipp.sckeedoo.abstractfactory.meal;


public class Pizza implements Meal {
    @Override
    public void prepare() {
        System.out.println(Pizza.class.getSimpleName() + " is prepared.");
    }
}
