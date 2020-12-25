package StructuralPatterns.Composite.Scholar;

public abstract class BaseScholar implements Scholar {

    protected int salary;

    public BaseScholar(int salary) {
        setSalary(salary);
    }

    @Override
    public void teach() {
        System.out.println("TEACHING...");
    }

    @Override
    public void research() {
        System.out.println("RESEARCHING...");
    }

    @Override
    public int getSalary() {
        return this.salary;
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
