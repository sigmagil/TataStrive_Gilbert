package day4;

public class BankAccount {
	int accountNumber;
	double balance=200;
	int amount;

	public BankAccount() {
	}

	public BankAccount(int accountNumber, int amount) {
		this.accountNumber = accountNumber;
		this.amount= amount;
		if(amount>0){
			balance+=amount;
		}
		else if (amount<0) {
			balance-=amount;
		}
	
	}
/*
	public void deposit() {
			}

	public void withdraw() {
		
	}
*/
	@Override
	public String toString() {
		return "AccountNumber=" + accountNumber + "\nbalance=" + balance;
	}

}
