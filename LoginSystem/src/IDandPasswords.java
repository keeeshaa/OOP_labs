import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){

        logininfo.put("Yerke","kesha");
        logininfo.put("Erkejan","PASSWORD");
        logininfo.put("noname","abc123");
    }

    public HashMap getLoginInfo(){
        return logininfo;
    }
}