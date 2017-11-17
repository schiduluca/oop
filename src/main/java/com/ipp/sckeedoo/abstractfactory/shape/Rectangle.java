package com.ipp.sckeedoo.abstractfactory.shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println(this.getClass().getSimpleName() + " is drawn.");
    }
}
