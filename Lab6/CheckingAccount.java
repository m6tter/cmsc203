public class CheckingAccount extends BankAccount {
    private final double FEE = 0.15;
    private String accountNumber;
  
    public CheckingAccount(String name, double amount) {
        super(name, amount);
        this.accountNumber = this.getAccountNumber() + "-10";
        this.setAccountNumber(this.accountNumber);
    }
    
    public boolean withdraw(double amount) {
        
    	amount = amount + FEE;
        boolean completed = true;

		if (amount > this.getBalance() || (amount + FEE) > this.getBalance())
		{
			return false;
		}
		else
		{
			super.withdraw(amount);
			completed = true;
		}
		return completed;
    }

}
