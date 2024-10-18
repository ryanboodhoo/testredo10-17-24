package Main;

public abstract class Account {
    private static int counter = 1;
    private final int accountNumber;
    private double balance;

    public Account() {
        this.accountNumber = counter++;
    }

    public abstract AccountType getAccountType();

    public void withdraw(double amount) {
        double fee = getTransactionFee(getAccountType());

        if (balance >= amount + fee) {
            balance -= (amount + fee);
            System.out.println("Withdraw successful. Amount: " + String.format("%.2f", amount) +
                    ", Fee: " + String.format("%.2f", fee) +
                    ", New Balance: " + String.format("%.2f", balance));
        } else {
            System.out.println("Insufficient Funds. Tried to withdraw: " + String.format("%.2f", amount) +
                    ", Available balance: " + String.format("%.2f", balance) +
                    ", Required: " + String.format("%.2f", amount + fee));
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else {

            double newBalance = balance += amount;

            double interest = getInterestRate(newBalance,amount);

            balance = newBalance + interest;

            System.out.println("Deposit successful. Amount deposited: " + String.format("%.2f", amount) +
                    ", Interest added: " + String.format("%.2f", interest) +
                    ", New Balance: " + String.format("%.2f", balance));
        }
    }

    public double getInterestRate(double currentBalance,double amount) {
        if (currentBalance > 1000) {
            return amount * 0.10;
        } else {
            return amount * 0.05;
        }
    }

    public abstract double getTransactionFee(AccountType accountType);

    public String printAccountInfo() {
        return "Account Type: " + getAccountType() + "\n" +
                "Account Number: " + accountNumber + "\n" +
                "Balance: $" + String.format("%.2f", balance);
    }

    public static void printTotalNumberOfAccounts() {
        System.out.println("Total Accounts: " + (counter - 1));
    }
}
