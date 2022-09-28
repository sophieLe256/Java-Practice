package digit.numbers;

public class numberToWords_ver2 {
    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
        numberToWords(0);

        System.out.println();

        System.out.println(reverse(-121));
        System.out.println(reverse(1212));
        System.out.println(reverse(12345));
        System.out.println(reverse(100));

        System.out.println();

        System.out.println(getDigitCount(0));
        System.out.println(getDigitCount(123));
        System.out.println(getDigitCount(-12));
        System.out.println(getDigitCount(5200));

    }

    public static int getDigitCount(int number) {
        int sumOfDigits = 0;
        if (number >= 0) {
            if(number == 0) {
                sumOfDigits = 1;
            }
             // Phương pháp này không tối ưu vì số 123 -> 2 số (sai)
//                for (int i = 1; i <= number; i++){
//                    int lastDigits = number % 10;
//                    number /= 10;
//                    sumOfDigits++;
//                }
            while(number > 0){
                int lastDigits = number % 10;
                number /= 10;
                sumOfDigits++;
            }
                return sumOfDigits;
            }
        return -1;
    }
    public static int reverse (int number){
        int reverseNumber = 0;
        while (number != 0){
            int lastDigit = number % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            number /= 10;
        }
        return reverseNumber;
    }
    public static void numberToWords(int number){
        if(number >= 0) {
            int reverse = reverse(number);
            int count = getDigitCount(number);
            for (int i = 0; i <= count; i++) {
                int digit = reverse % 10;
                switch (digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                reverse /= 10;
            }
        } else {
            System.out.println("Invalid Value");
        }
    }
}

