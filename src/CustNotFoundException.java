package src;

// Exception is a built-in java class for something that can be thrown
// This is a "checked" exception
public class CustNotFoundException extends Exception {

    // Might want to keep track of some stuff about the failure
    public String custName;

    public CustNotFoundException(String cn) {
        this.custName = cn;
    }
}
