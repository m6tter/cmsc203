public class SavingsAccount extends BankAccount {

    private double rate = 0.025;
    private int savingsNumber = 0;
    private String accountNumber;

    public SavingsAccount(String name, double amount) {
        super(name, amount);
        this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
        this.setAccountNumber(this.accountNumber);
    }

    public void postInterest() {
        double interest = (super.getBalance() * rate) / 12;
        super.deposit(interest);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public SavingsAccount(SavingsAccount original, double amount) {
        super(original, amount);
        this.savingsNumber++;
        this.accountNumber = super.getAccountNumber().substring(0, 6) + "-" + savingsNumber;
        this.setAccountNumber(this.accountNumber);
    }

}
