public class BankAccount {
    private double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
    }

    public void withdraw(double sum) {
        if (sum > amount) {
            throw new LimitException("Requested amount exceeds account balance", amount);
        }else {
            amount -= sum;
        }
    }
}

