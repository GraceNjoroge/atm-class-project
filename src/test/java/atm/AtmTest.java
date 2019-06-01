package atm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AtmTest {

	public void shouldBeAbleToAddAccount() {
		//Arrange
	}
	
	@Test
	public void shouldHaveDefaultBalanceof100() {
		// arrange
		Atm underTest = new Atm(100, "");
		// act
		double balance = underTest.getBalance();
		// assert
		assertEquals(100, balance, 0.009);
	}

	@Test
	public void shouldHaveDefaultBalanceof200() {
		// arrange
		Atm underTest = new Atm(200, "");
		// act
		double balance = underTest.getBalance();
		// assert
		assertEquals(200, balance, 0.009);
	}

	@Test
	public void shouldHaveBalanceof100afterwithdrawing100() {
		// arrange
		Atm underTest = new Atm(200, "");
		underTest.withdraw(100);
		// act
		double balance = underTest.getBalance();
		
		// assert
		assertEquals(100, balance,0.009 );

	}

	@Test
	public void shouldHaveBalanceof0afterwithdrawing300() {
		// arrange
		Atm underTest = new Atm(200, "");
		underTest.withdraw(300);
		// act
		double balance = underTest.getBalance();
		// assert
		assertEquals(0, balance, 0.009);
	}

	@Test
	public void shouldHaveBalanceOf100AfterDeposit() {
		Atm underTest = new Atm(0, "");
		underTest.deposit(100);
		double balance = underTest.getBalance();
		assertEquals(100, balance, 0.009);
	}

	@Test
	public void shouldAllowAccessByPin() {
		Atm underTest = new Atm(0, "1234");
		boolean access = underTest.allowAccess("1234");
		assertTrue(access);
	}

	@Test
	public void shouldDenyAccessByPin() {
		Atm underTest = new Atm(0, "1234");
		boolean access = underTest.allowAccess("1235");
		assertFalse(access);
	}
}