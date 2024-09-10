package day4;

public class CurrentAccount extends BankAccount {
	int overdraftLimit;

	public CurrentAccount() {
		super();
	}

	public CurrentAccount(int accountNumber, int amount) {
		super(accountNumber,amount);
		//this.overdraftLimit =50000;
	}
	
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		if(amount>50000) {
			//System.out.println("your overdraftlimit is 50000");
			return "your overdraftlimit is 50000";
		}
		return super.toString() + overdraftLimit;
	}
	
	
}
