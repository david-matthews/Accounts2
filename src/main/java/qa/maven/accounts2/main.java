package qa.maven.accounts2;

public class main {
	public static void main(String[]args)
	{
		Accounts person1 = new Accounts ("David", "Matthews", 12345);
	
	
	Service map = new Service();
	
	map.addAccount(person1);

	}
}
