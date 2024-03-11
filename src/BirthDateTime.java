import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = SafeInput.getRangedInt(in, "Enter the year of your birth", 1950, 2015);
        int month = SafeInput.getRangedInt(in, "Enter the month of your birth", 1, 12);
        int day = getDay(in, month); // Call separate method to handle days based on month
        int hours = SafeInput.getRangedInt(in, "Enter the hour of your birth", 1, 24);
        int minutes = SafeInput.getRangedInt(in, "Enter the minutes of your birth", 1, 59);
        System.out.println("\nYour birth date and time is: " + month + "/" + day + "/" + year + " " + hours + ":" + minutes);
    }

    private static int getDay(Scanner in, int month) {
        int days;
        switch (month) {
            case 2:
                days = SafeInput.getRangedInt(in, "Enter the day of your birth", 1, 29);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = SafeInput.getRangedInt(in, "Enter the day of your birth", 1, 30);
                break;
            default:
                days = SafeInput.getRangedInt(in, "Enter the day of your birth", 1, 31);
                break;
        }
        return days;
    }
}
