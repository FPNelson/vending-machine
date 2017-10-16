package kata.vending_machine;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VendingMachineTest {
	@Test
	public void whenNoCoinsAreInsertedInVendingMachineThenVendingMachineDisplaysINSERTCOIN() {
		VendingMachine vendingMachine = new VendingMachine();
		assertEquals("INSERT COIN", vendingMachine.getDisplayMessage());
	}
}
