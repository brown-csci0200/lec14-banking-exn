package src;
import java.util.LinkedList;

public class Customer {
    private String name;
    private String password;  
    private LinkedList<Account> accounts = new LinkedList<Account>();

    public Customer(String nm, String pwd){
        this.name = nm;
        this.password = pwd;
    }

    public boolean nameMatches(String aname) {
        return this.name.equals(aname);
    }

    public boolean checkPwd(String checkAgainst) {
        return this.password.equals(checkAgainst);
    }

    public void addAccount(Account newAcct) {
        this.accounts.addFirst(newAcct);
    }
}
