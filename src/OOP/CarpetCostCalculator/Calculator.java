package OOP.CarpetCostCalculator;
import java.lang.Math;

/**
 * 3. Write a class with the name Calculator.
 * The class needs two fields (instance variables) with name floor of type Floor and carpet of type Carpet.
 *
 * The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet and it needs to initialize the fields.
 *
 * Write the following methods (instance methods):
 *
 * Method named getTotalCost without any parameters,
 * it needs to return the calculated total cost to cover the floor with a carpet.
 */
public class Calculator {
    Floor floor;
    Carpet carpet;

    public Calculator(Floor floor, Carpet carpet){
        this.carpet = carpet;
        this.floor = floor;
    }

    public double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }
}
