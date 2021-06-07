package bankaccountapp;

public class Savings extends Account {
	
	int safetyDepositBoxID;
	int safetyDepositBoxKey;
	
	public Savings(String name, String aAI,double initialBalance) {
		super(name,aAI, initialBalance);
		accountNo = "S"+ accountNo;
	}
	
	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		iRate = getBaseRate() - .25;
	}
	
	private String setSafetyBox() {
		safetyDepositBoxID = (int)(Math.random() * Math.pow(10,3));
		safetyDepositBoxKey = (int)(Math.random() * Math.pow(10,4));
		return "Safety deposit Box Features: "+
				"\n"+"safetyDepositBoxID " + safetyDepositBoxID + 
				"\n"+"safetyDepositBoxkey "+safetyDepositBoxKey;
	}
	
	public void showInfo() {
		
		super.showInfo();
		System.out.println("Account Type: Savings");
		
		/*System.out.println("Safety box features : "+"\n"
		                    + "safetyBoxId: "+ this.safetyDepositBoxID+"\n"
		                    +"safetyBoXKey: "+ this.safetyDepositBoxKey);*/
		
		System.out.print(setSafetyBox());
		
	}

	
}
