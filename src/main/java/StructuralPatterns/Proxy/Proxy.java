package StructuralPatterns.Proxy;

import java.util.ArrayList;
import java.util.List;

public class Proxy implements ThirdPartyLib{
    private final String password;
    private static List<String> authorizationList;
    public final ThirdPartyLibrary lib;

    public Proxy(String password) {
        this.password = password;
        this.lib = new ThirdPartyLibrary();
        this.authorizationList = new ArrayList<>();
    }

    @Override
    public String getStudentInfo(String name) {
        String student_info;
        student_info = lib.getStudentInfo(name);
        return student_info;
    }

    public void authorize(String username, String password) {
        if (password.equals(this.password)) {
            if (!authorizationList.contains(username))
                authorizationList.add(username);
        } else {
            System.out.println("Wrong password for the user " + username + "\n");
        }
    }

    public String getStudentInformation(String username, String name) {
        String student_info;
        if (this.authorizationList.contains(username))
            student_info = getStudentInfo(name);
        else
            student_info = "Not authorized!";
        return student_info;
    }

}
