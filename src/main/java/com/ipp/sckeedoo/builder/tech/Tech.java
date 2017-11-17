package com.ipp.sckeedoo.builder.tech;

import com.ipp.sckeedoo.builder.types.TechType;

public interface Tech extends Cloneable {
    String name();
    Double price();
    TechType type();

}
