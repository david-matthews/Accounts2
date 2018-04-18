package qa.maven.accounts2;

import java.util.HashMap;
public class Service {
	
	HashMap<Integer, Accounts> hmap= new HashMap<Integer, Accounts>();
	
	private static int uniqueID = 0;
	
	public void addAccount (Accounts newAccount) 
	{
		hmap.put(uniqueID, newAccount);
		uniqueID++;
		}

	public void retrieveAccount (int SelectID) {
		hmap.get(SelectID);
		
	}
	
	public void removeAcount (int SelectID) {
		hmap.remove(SelectID);
	}
}
