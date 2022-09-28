package constructors.account;


// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
//
// Create getters and setters for each field
// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.
public class Constructors {
    public static void main(String[] args) {
        Account bobsAccount = new Account("63536", 0.00, "Bob Boo",
                "bob53@gmail.com", "(350)456-5434");

        System.out.println(bobsAccount.getCustomerName());

        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51);
        bobsAccount.withdrawal(100.0);

        Account nhiAccount = new Account("Nhi", "nhi45@gmail.com", "6836");
        System.out.println(nhiAccount.getNumber() + " name " + nhiAccount.getCustomerName());
    }
}
