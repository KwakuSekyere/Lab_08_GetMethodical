import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Test for SSN pattern
        String ssn = SafeInput.getRegExString(in, "Enter your SSN (e.g., 123-45-6789)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Entered SSN: " + ssn);

        // Test for UC Student M number pattern
        String mNumber = SafeInput.getRegExString(in, "Enter your UC Student M number (e.g., M12345)", "^(M|m)\\d{5}$");
        System.out.println("Entered M number: " + mNumber);

        // Test for menu choice pattern
        String menuChoice = SafeInput.getRegExString(in, "Choose a menu option (O: Open, S: Save, V: View, Q: Quit)", "^[OoSsVvQq]$");
        System.out.println("Chosen menu option: " + menuChoice);
    }
}

