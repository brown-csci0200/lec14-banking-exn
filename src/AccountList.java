import java.util.LinkedList;

public class AccountList {
    private LinkedList<Account> accounts = new LinkedList<Account>();

    AccountList(){}

    public int addAccount(Customer cust, double balance) {
        int newID = accounts.size() + 1;
        Account a = new Account(newID, cust, balance);
        accounts.add(a);
        return newID;
    }

    // this method is new -- it creates a helper from the
    // for loops that were in getBalance and withdraw
    public Account findAccount(int forAcctNum) {
        for (Account acct:accounts) {
            if (acct.numMatches(forAcctNum))
                return acct;
        }
        return null;
    }
}
