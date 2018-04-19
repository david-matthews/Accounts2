package qa.maven.accounts2;

import java.util.HashMap;
public class Service {
	
	HashMap<Integer, Accounts> hmap= new HashMap<Integer, Accounts>();
	
	public HashMap<Integer, Accounts> getHmap() {
		return hmap;
	}

	public void setHmap(HashMap<Integer, Accounts> hmap) {
		this.hmap = hmap;
	}

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
		boolean IDexists = hmap.containsKey(SelectID);
		
		if(IDexists) {
		hmap.remove(SelectID);
		}
	}
	
	
	public int getQuantityByFirstName(String firstName) {		
		return (int) hmap.values().stream().filter(x -> firstName.equals(x.getFirstName())).count();
	}
		
}
