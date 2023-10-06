package src;
import java.util.LinkedList;

public class CustomerList {
    private LinkedList<Customer> customers = new LinkedList<Customer>();

    public Customer addCustomer(String username, String pwd) {
        Customer newC = new Customer(username, pwd);
        customers.add(newC);
        return newC;
    }

    // Must tell java that this method will throw Exception
    public Customer findCustomer(String custname) throws CustNotFoundException{
        for (Customer cust:customers) {
            if (cust.nameMatches(custname)) {
                return cust;
            }
        }
        //return null; // was return "Oops -- don't know this customer"
        // Custom error type about this particular failure
        // Checked Exception
        // Java needs to know what methods can throw checked exceptions
        // You can think of "throw" like "return"--program execution stops here
        // method that called this one may handle the error, or may leave it for
        // its caller
        throw new CustNotFoundException(custname);
    }
}
