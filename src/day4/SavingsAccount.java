package day4;

public class SavingsAccount extends BankAccount {
	double interestRate;

	
	public SavingsAccount() {
		super();
	}


	public SavingsAccount(int accountNumber, int amount) {
		super(accountNumber,amount);
		//this.interestRate = interestRate;
		this.interestRate=balance+(balance/5);
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nInterest="+interestRate;
		
	}
	
	
}
