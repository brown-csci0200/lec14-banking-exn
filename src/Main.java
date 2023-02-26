public class Main {

    public static void main(String[] args) {
        // set up components (options would be chosen here)
        AccountList accounts = new AccountList();    // part of model
        CustomerList customers = new CustomerList(); // part of model
        BankingService controller = new BankingService(accounts, customers);
        BankingConsole view = new BankingConsole(controller);

        // set up initial data in the model
        Customer kCust = customers.addCustomer("kathi", "cs200");
        int kAcctNum = accounts.addAccount(kCust, 150);

        // interact with the bank
        view.loginScreen();
        view.showBalance(kAcctNum);
        view.withdraw(kAcctNum, 30);
        view.showBalance(kAcctNum);
    }
}
