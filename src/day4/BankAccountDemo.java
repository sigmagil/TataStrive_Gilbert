package day4;

public class BankAccountDemo {
	public static void main(String[] args) {
		BankAccount ba=new SavingsAccount(1234,50000);
		System.out.println(ba);
		System.out.println("------------------------");
		ba=new CurrentAccount(1234,5000);
		System.out.println(ba);
	}
}
