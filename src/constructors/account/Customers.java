package constructors.account;

public class Customers {
    public static void main(String[] args) {

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Steven", 2500.00);
        System.out.println(person2.getName() + " has " + person2.getCreditLimit() + " on credit lines");

        VipCustomer person3 = new VipCustomer("Sophie", 8000.00, "sp@email.com");
        System.out.println(person3.getEmailAddress());
        System.out.println(person3.getName());

    }
}
