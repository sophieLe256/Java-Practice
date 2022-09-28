package academy.programming;

public class SwitchStatement {
    public class BasicClass {
        public static void main(String[] args) {
            int switchValue = 3;
            switch (switchValue) {
                case 1:
                    System.out.println("Value was 1");
                    break;
                case 2:
                    System.out.println("Value was 2");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Was a 3, or a 4, or a 5");
                    System.out.println("Value was " + switchValue);
                    break;
                default:
                    System.out.println("Was bit 1 or 2");
                    break;
            }

        }
    }
}
