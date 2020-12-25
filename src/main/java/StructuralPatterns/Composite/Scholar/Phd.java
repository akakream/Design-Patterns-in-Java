package StructuralPatterns.Composite.Scholar;

public class Phd extends BaseScholar {

    private final int ranking = 2;

    public Phd(int salary) {
        super(salary);
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }

    public int getRanking() {
        return ranking;
    }
}
