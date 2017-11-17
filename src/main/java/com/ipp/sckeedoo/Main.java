package com.ipp.sckeedoo;


import com.ipp.sckeedoo.abstractfactory.Factory;
import com.ipp.sckeedoo.abstractfactory.meal.Meal;
import com.ipp.sckeedoo.abstractfactory.SingletonEnum;
import com.ipp.sckeedoo.abstractfactory.meal.MealType;
import com.ipp.sckeedoo.abstractfactory.shape.Shape;
import com.ipp.sckeedoo.abstractfactory.shape.ShapeType;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        Factory factory = SingletonEnum.INSTANCE.getFactory();


        List<Shape> shapes = Arrays.stream(ShapeType.values())
                .map(factory::getShape)
                .collect(Collectors.toList());


        List<Meal> meals = Arrays.stream(MealType.values())
                .map(factory::getMeal)
                .collect(Collectors.toList());



        shapes.forEach(Shape::draw);
        meals.forEach(Meal::prepare);

    }
}
