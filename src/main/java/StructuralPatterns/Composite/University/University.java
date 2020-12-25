package StructuralPatterns.Composite.University;

import StructuralPatterns.Composite.Scholar.Scholar;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class University {

    public Map<String, Scholar> uni = new HashMap<>();

    public void addScholar(String scholarName, Scholar scholar) {
        this.uni.put(scholarName, scholar);
    }

    public void remove(String scholarName, Scholar scholar) {
        this.uni.remove(scholarName);
    }

    public void showScholars() {
        Iterator iter = this.uni.entrySet().iterator();
        while(iter.hasNext()) {
            Map.Entry pair = (Map.Entry)iter.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
            iter.remove(); // avoids a ConcurrentModificationException
        }
    }
}
