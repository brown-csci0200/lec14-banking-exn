package src;

import java.util.Scanner;

public class BankingConsole {
    BankingService controller;

    BankingConsole(BankingService b) {
        this.controller = b;
    }

    public void showBalance(int acctID) {
        System.out.println(controller.getBalance(acctID));
    }

    public double withdraw(int acctID, double amt) {
        return controller.withdraw(acctID, amt);
    }

    public void loginScreen() {
        Scanner keyboard = new Scanner(System.in);


        // Three outcomes
        //  - Successful login
        //  - Type password wrong
        //  - Customer not found
        // Check for errors, but also handle multiple attempts at login
        // Here's how you recover from error

        boolean loggedIn = false;
        while (!loggedIn) {   // Loop until loggedIn is true
            System.out.println("Welcome to the Bank.  Please log in.");
            System.out.print("Enter your username: ");
            String username = keyboard.next();
            System.out.print("Enter your password: ");
            String password = keyboard.next();
            try {
                loggedIn = controller.login(username, password);

                if (loggedIn) {
                    System.out.println("Thanks for logging in!");
                } else {
                    System.out.println("Login failed");
                }
            } catch (CustNotFoundException e) {
                System.out.println("Customer not found:  " + e.custName);
            }
        }
    }
}
