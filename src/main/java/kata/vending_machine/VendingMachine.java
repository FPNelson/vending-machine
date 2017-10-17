package kata.vending_machine;

public class VendingMachine {
	
	private final StringBuilder displayMessage;
	private double amount;
	private double coinReturnAmount;
	
	public VendingMachine() {
		displayMessage = new StringBuilder("INSERT COIN");
		amount = 0.00;
		coinReturnAmount = 0.00;
	}
	
	public String getDisplayMessage() {
		String message = displayMessage.toString();
		changeDisplayMessage(amount == 0 ? "INSERT COIN" : String.format("$%.2f", amount));
		return message;
	}
	
	public double getCoinReturnAmount() {
		return coinReturnAmount;
	}
	
	public void insertCoin(Coin coin) {
		switch(coin) {
			case QUARTER:
				amount += 0.15;
			case DIME:
				amount += 0.05;
			case NICKEL:
				amount += 0.05;
				changeDisplayMessage(String.format("$%.2f", amount));
				break;
			case PENNY:
				coinReturnAmount += 0.01;
				break;
		}
	}

	public void selectProduct(Product product) {
		switch(product) {
			case COLA:
				changeDisplayMessage("PRICE $1.00");
		}
	}
	
	private void changeDisplayMessage(String message) {
		displayMessage.delete(0, displayMessage.length());
		displayMessage.append(message);
	}
}
