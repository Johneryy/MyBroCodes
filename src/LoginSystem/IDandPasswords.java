package LoginSystem;

import java.util.HashMap;

public class IDandPasswords {
    HashMap<String, String> loginInfo = new HashMap<>();

    IDandPasswords() {
        loginInfo.put("Johnery","67544474");
        loginInfo.put("Cassandra","Sandra2022");
    }
    public HashMap getLoginInfo() {
        return loginInfo;
    }
}
