package StructuralPatterns.Composite.Scholar;

public class Professor extends BaseScholar {
    private final int ranking = 3;

    public Professor(int salary) {
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
