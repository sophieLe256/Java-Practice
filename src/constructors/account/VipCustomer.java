package constructors.account;

// Create a new class VipCustomer
// it should have 3 fields name, credit limit, and email address.
// create 3 constructors
// 1st constructor empty should call the constructor with 3 parameters with default values
// 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
// 3rd constructor should save all fields.
// create getters only for this using code generation of intellij as setters wont be needed
// test and confirm it works.

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    //1st constructor with all default values
    public VipCustomer(){
        this("Default name", 5000.00, "default@email.com");
        //System.out.println("Default");
    }

    //2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
    public VipCustomer(String name, double creditLimit){
        this(name, creditLimit, "unknown@gmail.com");
    }

    //// 3rd constructor should save all fields.
    public VipCustomer(String name, double creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
