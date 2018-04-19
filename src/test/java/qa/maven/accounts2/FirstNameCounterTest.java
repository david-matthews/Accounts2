package qa.maven.accounts2;

import static org.junit.Assert.*;

import org.junit.Test;

public class FirstNameCounterTest {
	
	private Service map;

	@Test
	public void test() {
		Accounts account1 = new Accounts("David", "Matthews","12345");
		Accounts account2 = new Accounts("Ben", "Green", "54321");
		Accounts account3 = new Accounts("David", "Green", "34512");
		
		map = new Service();
		
		map.addAccount(account1);
		map.addAccount(account2);
		map.addAccount(account3);
		
		int expectedNumOfSameFirstName = 2;
		assertEquals(expectedNumOfSameFirstName, map.getQuantityByFirstName("David"));
		assertEquals(0,map.getQuantityByFirstName("Tom"));
		
		System.out.println("Number of people with the first name of David: " + map.getQuantityByFirstName("David"));
		System.out.println("Number of people with the first name of Tom: " + map.getQuantityByFirstName("Tom"));
		
		
	}

}
