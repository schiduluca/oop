package com.ipp.sckeedoo.builder;

import com.ipp.sckeedoo.builder.prototype.TechCache;
import com.ipp.sckeedoo.builder.tech.Tech;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        TechCache.loadCache();
        List<Tech> collect = TechCache.getTech("Portable");
        List<Tech> portableTech = TechCache.getTech("Stationary");

        System.out.println("Portable tech:");
        collect.forEach(element -> System.out.println(element.name() + " " + element.price()));

        System.out.println("------------------------");
        System.out.println("Stationary tech: ");
        portableTech.forEach(element -> System.out.println(element.name() + " " + element.price()));
    }
}
