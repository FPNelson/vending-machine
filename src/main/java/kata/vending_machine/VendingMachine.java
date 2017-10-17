package kata.vending_machine;

public class VendingMachine {
	
	private double amount = 0.00;
	private double coinReturnAmount = 0.00;
	
	public String getDisplayMessage() {
		if(amount == 0)
			return "INSERT COIN";
		
		return String.format("%.2f", amount);
	}
	
	public double getCoinReturnAmount() {
		return coinReturnAmount;
	}
	
	public void insertCoin(Coin coin) {
		switch(coin) {
			case PENNY:
				coinReturnAmount += 0.01;
				break;
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
