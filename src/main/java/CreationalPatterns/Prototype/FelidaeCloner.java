package CreationalPatterns.Prototype;

import java.util.HashMap;
import java.util.Map;

public class FelidaeCloner {

    private Map<String, Felidae> databank = new HashMap<>();

    public FelidaeCloner() {
        Lion lion = new Lion(120);
        lion.somevar = 40;
        DomesticCat cat = new DomesticCat(25);
        cat.somevar = 20;

        databank.put("the lion", lion);
        databank.put("the cat", cat);
    }

    public Felidae get(String felidae) {
        return databank.get(felidae).clone();
    }
}
