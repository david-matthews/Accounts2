package qa.maven.accounts2;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstNameCounterTest {
	
	private Service service;
	private Accounts account1, account2, account3;

	@Test
	public void test() {
		account1 = new Accounts("David", "Matthews","12345");
		account2 = new Accounts("Ben", "Green", "54321");
		account3 = new Accounts("David", "Green", "34512");
		
		service.addAccount(account1);
		service.addAccount(account2);
		service.addAccount(account3);
		
		int numOfSameFirstName = 2;
		assertEquals(numOfSameFirstName, service.getQuantityByFirstName("David"));
		assertEquals(0,service.getQuantityByFirstName("Tom"));
		
		
		
	}

}
