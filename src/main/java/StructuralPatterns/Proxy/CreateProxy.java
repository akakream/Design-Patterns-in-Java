package StructuralPatterns.Proxy;

public class CreateProxy {

    private Proxy proxy;
    private Student[] students;

    public CreateProxy() {
        this.proxy = new Proxy("passy");
        Student a = new Student("ahmet", 19, Grade.A);
        Student b = new Student("ayse", 21, Grade.B);
        Student c = new Student("ali", 20, Grade.C);
        this.students = new Student[] {a,b,c};
    }

    public Proxy getProxy() {
        return proxy;
    }

    public void registerStudents() {
        for (Student s: students)
            this.proxy.lib.saveStudent(s);
    }
}
