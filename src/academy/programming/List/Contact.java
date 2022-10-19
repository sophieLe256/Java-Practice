package academy.programming.List;

/**
 * A contact class
 */

public class Contact {
    private String name;
    private int phoneNumber;


    public Contact(String name, int phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    //Create a new contact and return it
    public static Contact createContact(String name, int phoneNumber){
        return new Contact(name, phoneNumber);
    }
}
