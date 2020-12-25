package StructuralPatterns.Proxy;

public class Student {
    private String name;
    private int age;
    private Grade grade;

    public Student(String name, int age, Grade grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Grade getGrade() {
        return grade;
    }
}
