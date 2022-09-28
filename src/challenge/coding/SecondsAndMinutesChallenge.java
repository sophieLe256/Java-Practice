package challenge.coding;

public class SecondsAndMinutesChallenge {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value"; //Constant values are always capitalized and can not be changed
    public static void main(String[] args) {

        System.out.println(getDurationString(65, 56));
        System.out.println(getDurationString(7545L));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65, 9));

    }
    private static String getDurationString(long minutes, long seconds) {

        // First thing is to eliminate the impossible case that could happen
        if((minutes < 0) || (seconds <0) || (seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }
        long hours = minutes / 60;
        long remainingMinutes = minutes % 60;

        String hoursString = hours + "h"; // Convert the hours to the String
        if(hours < 10){
            hoursString = "0" + hoursString;
        }

        String minutesString = remainingMinutes + "m"; // Convert the minutes to the String
        if(remainingMinutes < 10){
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s"; // Convert the seconds to the String
        if(seconds < 10){
            secondsString = "0" + secondsString;
        }


        return hoursString + " " + minutesString + " " + secondsString + " ";
    }

    private static String getDurationString(long seconds) {
        if(seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }
}
