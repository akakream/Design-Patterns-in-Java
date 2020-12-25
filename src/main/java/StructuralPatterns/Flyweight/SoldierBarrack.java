package StructuralPatterns.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class SoldierBarrack {
    static Map<String, SoldierType> soldierTypes = new HashMap<>();

    public static SoldierType getSoldierType(String country) {
        SoldierType query = soldierTypes.get(country);
        if (query == null) {
            query = new SoldierType(country);
            soldierTypes.put(country, query);
        }
        return query;
    }
}
