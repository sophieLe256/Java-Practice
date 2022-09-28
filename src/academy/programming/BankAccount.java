package academy.programming;

public class BankAccount {
        public static void main(String[] args) {

            //original = float(raw_input("Enter initial balance: "))

            //interest = float(raw_input("Enter promised return: "))

            //expenses = float(raw_input("Enter monthly expenses: "))



            double interest = 0.5 / 100 / 12;
            //System.out.println(interest);

            int month = 0;

            double balance = 10000;



            if(balance * interest - 500 >= 0) {

                System.out.println("You don't need to worry.");

            } else {

                while (balance + balance * interest - 500 >= 0) {// negation of the if condition

                    balance = balance + interest * balance; // in one month

                    balance = balance - 500;

                    month = month + 1;

                    System.out.println("Month " + month + " : "  + balance);
                    //System.out.println(balance);
                }
            }

            System.out.println( month / 12 + " years and " + month % 12 + " months");

        }
    }



