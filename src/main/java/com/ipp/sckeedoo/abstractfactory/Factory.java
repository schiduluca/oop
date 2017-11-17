package com.ipp.sckeedoo.abstractfactory;


import com.ipp.sckeedoo.abstractfactory.meal.*;
import com.ipp.sckeedoo.abstractfactory.shape.Circle;
import com.ipp.sckeedoo.abstractfactory.shape.Rectangle;
import com.ipp.sckeedoo.abstractfactory.shape.Shape;
import com.ipp.sckeedoo.abstractfactory.shape.ShapeType;

public class Factory extends AbstractFactory {

    @Override
    public Shape getShape(ShapeType shapeType) {
        switch (shapeType) {
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
            default:
                throw new IllegalArgumentException("No such shape");
        }
    }

    @Override
    public Meal getMeal(MealType mealType) {
        switch (mealType) {
            case PIZZA:
                return new Pizza();
            case BURGER:
                return new Burger();
            case SPAGETTI:
                return new Spagetti();
            default:
                throw new IllegalArgumentException("No such meal");
        }
    }
}
