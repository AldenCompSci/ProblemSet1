/* This code is my own work. It was written without consulting code written by
other students or code from online resources. Alden Harting */

public class ProblemSet1 {
    public static void main(String[] args) {
        System.out.println("American format:" + getAmerican("Wednesday",18,"September",2024));
        System.out.println("European format:" + getEuropean("Wednesday",18,"September",2024));

        System.out.println();
        System.out.println("Current time is 1:02:30");

        System.out.println("Seconds since midnight: " + secondsSinceMidnight(1,2,30));

        System.out.println("Seconds left today: " + secondsLeftToday(1,2,30));

        System.out.println("Percent of day passed: " + percentOfDayPassed(1,2,30));

        System.out.println();
        System.out.println(multadd(.5,Math.cos(Math.PI/4),Math.sin(Math.PI/4)));
        System.out.println(multadd(2,Math.log(2), Math.log(50)));

        System.out.println("Yikes:");
        System.out.println(yikes(2));
        System.out.println(yikes(3));



    }
    public static String getAmerican(String DayWeek, int Date, String Month, int Year) {

        String AmericanFormat = (DayWeek + ", " + Month + " " + Date + ", " + Year);
        return AmericanFormat;
    }

    public static String getEuropean(String DayWeek, int Date, String Month, int Year) {

        String EuroFormat = (DayWeek + " " + Date + " " + Month + ", " + Year);
        return EuroFormat;
    }

    public static int secondsSinceMidnight(int hour, int minute, int second) {
        return (hour * 3600 + minute * 60 + second);
    }

    public static int secondsLeftToday(int hour, int minute, int second) {
        return (86400 - (hour * 3600 + minute * 60 + second));
    }


    public static double percentOfDayPassed(double hour, double minute, double second) {
        return ((hour * 3600 + minute * 60 + second)/86400 * 100);
    }

    public static double multadd(double a, double b, double c) {
        return a*b+c;

    }

    public static double yikes(double x){
        return multadd(x, Math.pow(Math.E, -x), Math.sqrt(1-Math.pow(Math.E, -x)));

    }





}
