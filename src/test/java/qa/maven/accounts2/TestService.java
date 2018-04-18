package qa.maven.accounts2;

import static org.junit.Assert.*;


import org.junit.Test;

public class TestService {

	@Test
	public void TestAddAccounts() {
		Accounts testAccount = new Accounts("David","Matthews",12345);
		Service testService = new Service();
		testService.addAccount(testAccount);
		assertEquals(testService.getHmap().size(),1);
		}
	
	@Test
	public void TestRemoveAccounts() {
		Accounts testAccount1 = new Accounts("Ben","Green",54321);
		Service testService1 = new Service();
		testService1.addAccount(testAccount1);
		testService1.removeAcount(1);
		assertEquals(testService1.getHmap().size(),0);
		}
}
