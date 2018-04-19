package qa.maven.accounts2;

public class Accounts {
	private String firstName;
	private String surName;
	private String accountNumber;
	private int ID;

	public Accounts(String firstName, String surName, String accountNumber) {
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
	
	public String getAccountNumber() {
		return accountNumber; 
		
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
}
