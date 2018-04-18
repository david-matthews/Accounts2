package qa.maven.accounts2;

public class Accounts {
	private String firstName;
	private String surName;
	private int accountNumber;
	private int ID;

	public Accounts(String firstName, String surName, int accountNumber) {
	this.firstName = firstName;
	this.surName = surName;
	this.accountNumber = accountNumber;
	}
	
	public String getSurname() {
		return surName; 
		
	}
	
	public void setSurname(String surName) {
		this.surName = surName;
	}
	
	public String getFirstName() {
		return firstName; 
		
	}
	
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public int getAccountNumber() {
		return accountNumber; 
		
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
}
