package kata.vending_machine;

public class VendingMachine {
	
	double amount = 0.00;
	
	public String getDisplayMessage() {
		if(amount == 0)
			return "INSERT COIN";
		
		return String.format("%.2f", amount);
	}

	public void insertCoin(Coin coin) {
		switch(coin) {
			case NICKEL:
				amount += 0.05;
				break;
			case DIME:
				amount += 0.10;
				break;
			case QUARTER:
				amount += 0.25;
				break;
		}
	}
	
}
