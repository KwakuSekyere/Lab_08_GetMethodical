import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0;
        do {
            double price = SafeInput.getRangedDouble(in, "Enter the price of the item ($0.50 - $10.00)", 0.50, 10.00);
            total += price;
        } while (SafeInput.getYNConfirm(in, "Do you have more items to purchase?"));
        System.out.printf("\nTotal cost of the items: $%.2f\n", total);
    }
}
