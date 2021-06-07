package bankaccountapp;

public abstract class Account implements IRate{
	
	private String name;
	private String aAI;
	protected String accountNo;
	protected double balance;
	protected double iRate;
	
	private static int index=10000;
	
	
	public Account(String name,String aAI,double initialBalance) {
		this.name=name;
		this.aAI =aAI;
		balance=initialBalance;
		/*System.out.println("NAME: "+ name);
		System.out.println("AAI: "+aAI);
		System.out.println("Initial Amount: "+initialBalance);
		*/
		index++;
		
		this.accountNo = setAccountNumber();
		setRate();
	}
	
	public abstract void setRate();
	
	private String setAccountNumber() {
		String lastTwoAAI = aAI.substring((aAI.length()-2), aAI.length());
		int uniqueID = index;
		int random = (int)(Math.random() * Math.pow(10, 4));
		
		return lastTwoAAI+index+random;
	}
	
	public void compound() {
		double interest = balance * (iRate/100);
		System.out.println(" Your interst is: "+ interest);
	}
	
	public void showInfo(){
		System.out.println("------  Account details ----");
		System.out.println("Name: "+ this.name+"\n"
		                  + "AAI no: "+ this.aAI+"\n"
		                  + "AccountNo: "+ this.accountNo +"\n"
		                  + "Balance: "+ this.balance+"\n"
		                  + "Rate: "+ this.iRate);
	}
	
	public void deposit(double amount) {
		balance = balance+amount;
		System.out.println("Depositing amount is "+ amount);
		printBalance();
	}
	public void withdraw(double amount) {
		balance = balance-amount;
		System.out.println("Withdrawing amount is "+ amount);
		printBalance();
	}
	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println(amount+ "Amount transferring to "+ toWhere);
		printBalance();
	}
	public void printBalance() {
		System.out.println("Your account Balance is "+ balance);
	}
	
	
	
	
	
}
