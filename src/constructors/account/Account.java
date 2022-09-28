package constructors.account;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    //all the other constructor should call the major constructor to
    // avoid duplicating initialization more than one place
    public Account(){
        this("45678", 2.50, "default name","Default address", "default phone");
        System.out.println("Empty constructor called");
    }

    //This is major constructor
    public Account(String number, double balance, String customerName,
                   String customerEmailAddress, String customerPhoneNumber){
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;

    }
    //add another constructor
    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("99999", 100.55, customerName, customerEmailAddress, customerPhoneNumber);

    }
    public void deposit (double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);

    }
    public void withdrawal(double withdrawalAmount){
        //if the withdrawal amount equal or less than 0, the withdrawal won't be processed
        if(balance - withdrawalAmount <= 0){
            System.out.println("Only " + this.balance + " available. Withdrawal not processed!");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " process. Remaining balance = " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
