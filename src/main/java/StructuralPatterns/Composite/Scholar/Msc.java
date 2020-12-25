package StructuralPatterns.Composite.Scholar;

public class Msc extends BaseScholar {
    private final int ranking = 1;

    public Msc(int salary) {
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
