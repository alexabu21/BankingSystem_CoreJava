package bankaccountapp;



import java.util.List;

public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String file = "E:\\Code\\Java\\banking details\\NewBankAccounts.CSV";
		
		/*Checking check = new Checking("alex","12345678",2000);
		
		Savings saving = new  Savings("pandian","54323568",3000);
		
		check.showInfo();
		check.compound();
		
		
		System.out.println("*************");
		
		saving.showInfo();
		saving.compound();*/
		
		List<String[]> newAccountHolders = utilities.CSV.read(file);
		
		for(String[] newAccounts:newAccountHolders) {
			System.out.println("NEW Account Holders details");
			System.out.println(newAccounts[0]);
			System.out.println(newAccounts[1]);
			System.out.println(newAccounts[2]);
			System.out.println(newAccounts[3]);
		}
		
		
	}

}
