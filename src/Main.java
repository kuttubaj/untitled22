// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(20000.0);

        double withdrawAmount = 6000.0;

        while (true) {
            try {
                account.withdraw(withdrawAmount);
                System.out.println("Withdrawn " + withdrawAmount + " som");
            } catch (LimitException e) {
                double remainingAmount = e.getRemainingAmount();
                System.out.println("Withdrawn " + remainingAmount + " som. Reached account limit.");
                break;
            }
        }
    }
}