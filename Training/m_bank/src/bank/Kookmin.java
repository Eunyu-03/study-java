package bank;

public class Kookmin extends Bank {
	public void withdraw(int money) {
		money*=1.5;
		super.withdraw(money);
	}

}
