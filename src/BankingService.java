package src;

import java.util.LinkedList;

public class BankingService {
    AccountList accounts;
    CustomerList customers;

    public BankingService(AccountList al, CustomerList cl) {
        this.accounts = al;
        this.customers = cl;
    }

    public double getBalance(int forAcctNum) {
        return accounts.findAccount(forAcctNum).getBalance();
    }

    public double withdraw(int forAcctNum, double amt) {
        return accounts.findAccount(forAcctNum).withdraw(amt);
    }

    public String login(String custname, String withPwd) {
        Customer cust = customers.findCustomer(custname);
        if (cust.checkPwd(withPwd)) {
            return "Welcome";
        } else {
            return "Try Again";
        }
    }
}
