package StructuralPatterns.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class WW2 {
    public List createGermanForces() {
        List<Soldier> germanSoldiers = new ArrayList<>();
        SoldierType german = new SoldierType("DE");
        Soldier hans = new Soldier(5,5,german);
        Soldier klaus = new Soldier(5,5,german);
        Soldier peter = new Soldier(5,5,german);
        germanSoldiers.add(hans);
        germanSoldiers.add(klaus);
        germanSoldiers.add(peter);

        return germanSoldiers;
    }

    public List createAmericanForces() {
        List<Soldier> americanSoldiers = new ArrayList<>();
        SoldierType american = new SoldierType("USA");
        Soldier jack = new Soldier(10,10,american);
        Soldier steve = new Soldier(10,10,american);
        Soldier michael = new Soldier(10,10,american);
        americanSoldiers.add(jack);
        americanSoldiers.add(steve);
        americanSoldiers.add(michael);

        return americanSoldiers;
    }
}
