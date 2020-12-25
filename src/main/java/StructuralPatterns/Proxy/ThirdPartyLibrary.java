package StructuralPatterns.Proxy;

import java.util.HashMap;
import java.util.Map;

public class ThirdPartyLibrary implements ThirdPartyLib{

    private final Map<String, Student> student_list;

    public ThirdPartyLibrary() {
        this.student_list = new HashMap<>();
    }

    public void saveStudent(Student student) {
        if (!student_list.containsKey(student.getName()))
            student_list.put(student.getName(), student);
    }

    @Override
    public String getStudentInfo(String name) {
        Student student;
        String result;
        if (student_list.containsKey(name)) {
            student = student_list.get(name);
            result = "" + student.getName() + "\n" + student.getAge() + "\n" + student.getGrade() + "\n";
        } else {
            result = "No such a student";
        }
        return result;
    }
}
