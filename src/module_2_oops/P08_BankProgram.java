package module_2_oops;

abstract class Bank {

	abstract void getBalance();

}

class BankA extends Bank {

	float balance;

	BankA(float b) {
		this.balance = b;
	}

	@Override
	void getBalance() {
		System.out.println("Current balance in BankA is " + this.balance + " $");
	}

}

class BankB extends Bank {

	float balance;

	BankB(float b) {
		this.balance = b;
	}

	@Override
	void getBalance() {
		System.out.println("Current balance in BankB is " + this.balance + " $");
	}

}

class BankC extends Bank {

	float balance;

	BankC(float b) {
		this.balance = b;
	}

	@Override
	void getBalance() {
		System.out.println("Current balance in BankC is " + this.balance + " $");
	}
}

public class P08_BankProgram {

	public static void main(String[] args) {
		BankA a = new BankA(100);
		BankB b = new BankB(150);
		BankC c = new BankC(200);
		a.getBalance();
		b.getBalance();
		c.getBalance();
	}
}