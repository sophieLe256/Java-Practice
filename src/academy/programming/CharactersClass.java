package academy.programming;

public class CharactersClass {
    public static void main(String[] args){
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;
        if (isCustomerOverTwentyOne){
            System.out.println("Customer is 21 years old");
        }
    }
}
