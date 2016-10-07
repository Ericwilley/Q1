package Main;

public class test {

	public static void main(String[] args) {
		
		account Account1 = new account();
		Account1.setID(1122);
		Account1.setBalance(20000);
		Account1.setAnnualInterestRate(4.5);
		
		Account1.deposit(2500);
		Account1.withdraw(30000);
		
		System.out.print("The balance is " + "$" + Account1.getBalance() + "." + 
		"The per month interest is " + Account1.getMonthlyInterest() + "." + 
		"The account was created on " + Account1.getDateCreated());

	}

}
