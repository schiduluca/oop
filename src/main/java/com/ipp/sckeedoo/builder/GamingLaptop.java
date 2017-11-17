package com.ipp.sckeedoo.builder;

import com.ipp.sckeedoo.builder.tech.impl.Laptop;

public class GamingLaptop extends Laptop {
    @Override
    public String name() {
        return "Acer - Predator 17";
    }

    @Override
    public Double price() {
        return 1099.9;
    }
}
