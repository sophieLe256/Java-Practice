package Hamburger;
// The purpose of the application is to help a fictitious company called Bills Burgers to manage
// their process of selling hamburgers.
// Our application will help Bill to select types of burgers, some of the additional items (additions) to
// be added to the burgers and pricing.
// We want to create a base hamburger, but also two other types of hamburgers that are popular ones in Bills store.
// The basic hamburger should have the following items.
// Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
// the customer can select to be added to the burger.
// Each one of these items gets charged an additional price so you need some way to track how many items got added
// and to calculate the final price (base burger with all the additions).
// This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
// Create a Hamburger class to deal with all the above.
// The constructor should only include the roll type, meat and price, can also include name of burger or you
// can use a setter.
// Also create two extra varieties of Hamburgers (subclasses) to cater for
public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.65, "White");

        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.12);
        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Healthy", 4.50);
        healthyBurger.addHealthyBurgerAddition1("Egg", 5.30);
        healthyBurger.itemizeHamburger();
        healthyBurger.addHealthyBurgerAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is ");

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition1("Should not do this", 50.53);
        db.itemizeHamburger();
        db.addHamburgerAddition3("Should not do this", 20.32);
        db.itemizeHamburger();
    }


}
