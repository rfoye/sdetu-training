package oop;

public class BankAccount implements IRate {
	// Define variables
	String accountNumber;
	
	// static belongs to the class, not the object instance
	// final makes it a constant
	private static final String routingNumber = "45665";
	
	//instance variables
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	// Constructor definitions. Unique methods
		// 1. Used to define/ setup / initialize properties of an object
		// 2. implicitly called upon instantiation.
		// 3. The same name as the Class itself.
		// 4. Constructors have no return type
	
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	// Overloading: call same method name with different arguments
	// Polymorphism through overloading
	
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	BankAccount(String accountType, double initDeposit){
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT OF $" + initDeposit);
		String msg = null;
		if (initDeposit < 1000) {
			msg = "ERROR: minimum deposit must be at least $1000";
			System.out.println(msg);
		} else {
			msg = "Thanks for your initial deposit of: $" + initDeposit;
		}
		System.out.println(msg);
		balance = initDeposit;
	}
	// Getters & Setters
	// allow user to define the name
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
		
	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	
	// Interface Methods
	public void setRate() {
		System.out.println("SETTING RATE");
	}
	public void increaseRate() {
		System.out.println("INCREASING RATE");
	}
	
	
	
	// Define Methods
	void deposit(double amount) {
		balance = balance + amount;
		showActivity ("DEPOSIT");
	}
	
	void withdraw(double amount) {
		balance = balance + amount;
		showActivity ("WITHDRAW");
	}
	// private: can only be called from within the class
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("YOUR NEW BALANCE IS: $" + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance: " + balance);
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[ NAME: " + name + ", ACCOUNT NUMBER: " + accountNumber + ", ROUTING NUMBER: " + routingNumber + ", BALANCE: $" + balance + " ]";
	}
}
