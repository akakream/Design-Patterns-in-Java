package TestStructuralPatterns;

import StructuralPatterns.Proxy.CreateProxy;
import StructuralPatterns.Proxy.LibUser;
import StructuralPatterns.Proxy.Proxy;
import org.junit.jupiter.api.Test;

public class TestProxy {
    @Test
    public void testMain() {
        CreateProxy proxyGod = new CreateProxy();
        proxyGod.registerStudents();
        LibUser user = new LibUser("kral", "party", proxyGod.getProxy());
        user.authorizeUser();

        String res = user.getStudentInfo("keke");
        System.out.println(res);

        user.setPassword("passy");
        user.authorizeUser();
        res = user.getStudentInfo("keke");
        System.out.println(res);
        res = user.getStudentInfo("ahmet");
        System.out.println(res);
    }
}
