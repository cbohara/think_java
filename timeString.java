public class timeString {
    public static void main(String args[]) {
        System.out.println(timeString(0, 12));
    }
    public static String timeString(int hour, int minute) {
        String ampm;
        if (hour < 12) {
            ampm = "AM";
            if (hour == 0) {
                hour = 12;
            }
        } else {
            ampm = "PM";
            hour = hour - 12;
        }
        // works like printf except does not display result to screen
        // %02d is a 2 digit integer padded with zeros
        return String.format("%02d:%02d %s", hour, minute, ampm);
    }
}