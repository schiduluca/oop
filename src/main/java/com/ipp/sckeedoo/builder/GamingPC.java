package com.ipp.sckeedoo.builder;

import com.ipp.sckeedoo.builder.tech.impl.PC;

public class GamingPC extends PC {
    @Override
    public String name() {
        return "Super PC";
    }

    @Override
    public Double price() {
        return 1200.0;
    }
}
