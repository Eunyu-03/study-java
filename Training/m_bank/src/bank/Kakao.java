package bank;

public class Kakao extends Bank {
	
	public int showBalance() {
		this.setMoney(this.getMoney()/2);
		return super.showBalance()
;	}

}
