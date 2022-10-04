package Hamburger;
// a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
// The healthy burger can have 6 items (Additions) in total.
// hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
// not the base class (Hamburger), since the two additions are only appropriate for this new class
// (in other words new burger type).
public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    private String healthyExtra3Name;
    private double healthyExtra3Price;

    private String healthyExtra4Name;
    private double healthyExtra4Price;

    public HealthyBurger(String meat, double price){
        super("Healthy", meat, price, "brown rye bread");
    }

    public void addHealthyBurgerAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }
    public void addHealthyBurgerAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }
    public void addHealthyBurgerAddition3(String name, double price){
        this.healthyExtra3Name = name;
        this.healthyExtra3Price = price;
    }
    public void addHealthyBurgerAddition4(String name, double price){
        this.healthyExtra4Name = name;
        this.healthyExtra4Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if(this.healthyExtra1Name != null){
            hamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }
        if(this.healthyExtra2Name != null){
            hamburgerPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
        }
        if(this.healthyExtra3Name != null){
            hamburgerPrice += this.healthyExtra3Price;
            System.out.println("Added " + this.healthyExtra3Name + " for an extra " + this.healthyExtra3Price);
        }
        if(this.healthyExtra4Name != null){
            System.out.println("Added " + this.healthyExtra4Name + " for an extra " + this.healthyExtra4Price);
        }
        return  hamburgerPrice;
    }
}
