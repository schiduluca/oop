package com.ipp.sckeedoo.abstractfactory;


import com.ipp.sckeedoo.abstractfactory.meal.Meal;
import com.ipp.sckeedoo.abstractfactory.meal.MealType;
import com.ipp.sckeedoo.abstractfactory.shape.Shape;
import com.ipp.sckeedoo.abstractfactory.shape.ShapeType;

    public abstract class AbstractFactory {
    public abstract Shape getShape(ShapeType shapeType);
    public abstract Meal getMeal(MealType mealType);
}
