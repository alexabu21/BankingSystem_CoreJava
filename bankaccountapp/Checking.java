package bankaccountapp;

public class Checking extends Account {
	
	int debitCardNumber;
	int debitCardPIN;
	
	
	public Checking(String name,String aAI,double initialBalance) {
		super(name,aAI,initialBalance);
		accountNo = "C"+accountNo;
	}
	
	@Override
	public void setRate() {
		iRate = getBaseRate() * .15;
		
	}
	
	private String setDebitCard(){
		debitCardNumber = (int ) (Math.random() * Math.pow(10,12));
		debitCardPIN = (int ) (Math.random() * Math.pow(10,4));
		return "Safety deposit Box Features: "+
		"\n"+"Debit Card Number: " + debitCardNumber+ 
		"\n"+" Debit Card Pin: "+ debitCardPIN;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Account Type: Checking");
		System.out.println(setDebitCard());
	}

	
	
}
