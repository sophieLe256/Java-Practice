package Hamburger;
// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.
//  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
// plus all additional, each showing the addition name, and addition price, and a grand/final total for the
// burger (base price + all additions)
// For the two additional classes this may require you to be looking at the base class for pricing and then
// adding totals to final price.
public class DeluxeBurger extends Hamburger{

    public DeluxeBurger(){
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);

    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
//        super.addHamburgerAddition1(name, price);
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
//        super.addHamburgerAddition2(name, price);
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
//        super.addHamburgerAddition3(name, price);
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
//        super.addHamburgerAddition4(name, price);
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}
