package Main;

import java.util.Date;

public class account {

	private int id = 0;
	private double Balance = 0;
	private double AnnualInterestRate = 0;
	private Date DateCreated = new java.util.Date();
	
	public account(){
}
	public account(int Id, double initbalance){
		this.id = Id;
		this.Balance = initbalance;
		this.DateCreated = new Date();
	}
	
	public int getID(){
		return id;
	}
	
	public void setID(int id){
		this.id = id;
	}
	
	public double getBalance(){
		return Balance;
	}
	
	public void setBalance(double Balance){
		this.Balance = Balance;
	}
	
	public double getAnnualInterestRate(){
		return AnnualInterestRate;
	}
	
	public void setAnnualInterestRate(double AnnualInterestRate){
		this.AnnualInterestRate = AnnualInterestRate;
	}
	
	public Date getDateCreated(){
		return DateCreated;
	}
	
	public double getMonthlyInterest(){
		return (AnnualInterestRate / 12);
	}
	
	public void deposit(double amount){
		Balance += amount;
	}
	
	public void withdraw(double amount){
		Balance = Balance - amount;
	}
}
