package com.ipp.sckeedoo.builder.prototype;

import com.ipp.sckeedoo.builder.AndroidPhone;
import com.ipp.sckeedoo.builder.GamingLaptop;
import com.ipp.sckeedoo.builder.GamingPC;
import com.ipp.sckeedoo.builder.IOSPhone;
import com.ipp.sckeedoo.builder.tech.Tech;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TechCache {
    private static Map<String, List<Tech>> techMap = new HashMap<>();

    public static void loadCache() {
        techMap = Map.of("Portable", List.of(new AndroidPhone(),new GamingLaptop(),new IOSPhone()),
                "Stationary", List.of(new GamingPC()));
    }

    public static List<Tech> getTech(String id) {
        return techMap.get(id);
    }

    public static Map<String, List<Tech>> getTechMap() {
        return techMap;
    }

}
