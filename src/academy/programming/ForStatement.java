package academy.programming;

public class ForStatement {
    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(1000.00, 2.0));
        System.out.println("10,000 at 2% interest = " + calculateInterest(1000.00, 3.0));
        System.out.println("10,000 at 2% interest = " + calculateInterest(1000.00, 4.0));
        System.out.println("10,000 at 2% interest = " + calculateInterest(1000.00, 5.0));

        // using the for statement, call the calculateInterest method with
        // the amount of 10000 with an interestRate of 2,3,4,5,6,7 and 8
        // and print the results to the console window.
        for(int i = 2; i <= 8; i++ ){
            System.out.println("10,000 at " + i +"% interest = " +  String.format("%.2f", calculateInterest(1000.00, i))); // convert the number to 2 decimal points
        }
        // How would you modify the for loop above to do the same thing as shown but from 8% and work back  to 2%
        for(int i = 8; i >= 2; i-- ){
            System.out.println("10,000 at " + i +"% interest = " +  String.format("%.2f", calculateInterest(1000.00, i))); // convert the number to 2 decimal points
        }

        System.out.println();

        int count = 0;
        for(int i = 10; i < 50; i++){
            if(isPrime(i)){
                count++;
                System.out.println("Number " + i + " is a prime number");
                if(count == 10){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

    }
    // Create a for statement using any range of numbers
    // Determine if the number is a prime number using the isPrime method
    // if it is a prime number, print it out AND increment a count of the number of prime numbers found
    // if that count is 3 exit the for loop
    // hint: Use the break; statement to exit

    // Cách tìm số nguyên tố
    public static boolean isPrime(int n){

        if(n == 1){
            return false;
        }
        //for(int i = 2; i <= n/2; i++){
        // more briefing and convenience to use the square
        for(int i = 2; i <= (long) Math.sqrt(n); i++){
            System.out.println("Looping " + i);
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static double calculateInterest(double amount, double interestRate){
        return(amount * (interestRate/100));
    }
}
