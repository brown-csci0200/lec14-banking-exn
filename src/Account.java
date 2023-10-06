package src;

public class Account {
    private int idNumber;
    private Customer owner;
    private double balance;

    Account(int num, Customer c, double bal){
        this.idNumber = num;
        this.owner = c;
        this.balance = bal;
    }

    public boolean numMatches(int num) {
        return this.idNumber == num;
    }

    double withdraw(double amt) {
        if (this.balance >= amt)
            this.balance = this.balance - amt;
        return amt;
    }

    public double getBalance() { return this.balance; }
}
