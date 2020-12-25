package StructuralPatterns.Proxy;

public class LibUser {
    private String username;
    private String password;
    private Proxy proxyLib;

    public LibUser(String username, String password, Proxy proxyLib) {
        this.password = password;
        this.username = username;
        this.proxyLib = proxyLib;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void authorizeUser() {
        this.proxyLib.authorize(this.username, this.password);
    }

    public String getStudentInfo(String name) {
        return this.proxyLib.getStudentInformation(this.username, name);
    }
}
