package com.ipp.sckeedoo.builder;

import com.ipp.sckeedoo.builder.tech.impl.Smartphone;

public class IOSPhone extends Smartphone {
    @Override
    public String name() {
        return "Iphone X";
    }

    @Override
    public Double price() {
        return 1000.0;
    }
}
