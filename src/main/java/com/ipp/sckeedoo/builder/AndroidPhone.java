package com.ipp.sckeedoo.builder;

import com.ipp.sckeedoo.builder.tech.impl.Smartphone;

public class AndroidPhone extends Smartphone {
    @Override
    public String name() {
        return "Google Pixel 2";
    }

    @Override
    public Double price() {
        return 800.0;
    }
}
