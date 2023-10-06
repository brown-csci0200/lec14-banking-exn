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

    public boolean login(String custname, String withPwd) throws CustNotFoundException {
        // Handle error, or pass it on
        Customer cust = customers.findCustomer(custname);
        // Would like to be able to handle error in a way that's
        // not the normal control flow
        if (cust.checkPwd(withPwd)) {
            return true;
        } else {
            return false;
        }
    }

//    public boolean login(String custname, String withPwd) {
//        Customer cust = customers.findCustomer(custname);
//        if (cust.checkPwd(withPwd)) {
//            return true;
//        } else {
//            return false;
//        }
//    }
}
