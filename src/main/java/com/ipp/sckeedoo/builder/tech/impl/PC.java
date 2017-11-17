package com.ipp.sckeedoo.builder.tech.impl;

import com.ipp.sckeedoo.builder.tech.Tech;
import com.ipp.sckeedoo.builder.types.TechType;
import com.ipp.sckeedoo.builder.types.impl.Stationary;

public abstract class PC implements Tech {
    @Override
    public TechType type() {
        return new Stationary();
    }
}
