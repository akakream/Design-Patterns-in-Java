package StructuralPatterns.Composite.Scholar;

import java.util.ArrayList;
import java.util.Arrays;

public class Group extends BaseScholar {

    protected ArrayList<Scholar> scholar_list = new ArrayList<>();

    public Group(Scholar... scholars) {
        super(0);
        addScholar(scholars);
    }

    public void addScholar(Scholar scholar) {
        this.scholar_list.add(scholar);
    }

    public void addScholar(Scholar... scholars) {
        this.scholar_list.addAll(Arrays.asList(scholars));
    }

    public void deleteScholar(Scholar scholar) {
        this.scholar_list.remove(scholar);
    }

    public void deleteScholar(Scholar... scholars) {
        this.scholar_list.removeAll(Arrays.asList(scholars));
    }

    public void clear() {
        scholar_list.clear();
    }

    @Override
    public int getSalary() {
        int sumSalary = 0;
        for (Scholar s: scholar_list) {
            sumSalary += s.getSalary();
        }
        return sumSalary;
    }
}
