package kata.vending_machine;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class VendingMachineTest {
	
	private VendingMachine vendingMachine;
	
	@Before
	public void setup() {
		vendingMachine = new VendingMachine();
	}
	
	@Test
	public void whenNoCoinsAreInsertedInVendingMachineThenVendingMachineDisplaysINSERTCOIN() {
		assertEquals("INSERT COIN", vendingMachine.getDisplayMessage());
	}
	
	@Test
	public void whenNickelIsInsertedInVendingMachineThenDisplayAddsFiveCentsToTotal() {
		vendingMachine.insertCoin(Coin.NICKEL);
		assertEquals("0.05", vendingMachine.getDisplayMessage());
	}
	
	@Test
	public void whenTwoNickelsAreInsertedInVendingMachineThenDisplayAddsTenCentsToTotal() {
		vendingMachine.insertCoin(Coin.NICKEL);
		vendingMachine.insertCoin(Coin.NICKEL);
		assertEquals("0.10", vendingMachine.getDisplayMessage());
	}
	
	@Test
	public void whenDimeIsInsertedInVendingMachineThenDisplayAddsTenCentsToTotal() {
		vendingMachine.insertCoin(Coin.DIME);
		assertEquals("0.10", vendingMachine.getDisplayMessage());
	}
}
