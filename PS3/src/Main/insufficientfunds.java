package Main;

@SuppressWarnings("serial")
public class insufficientfunds extends Exception{
	private double amount;
	
	public insufficientfunds(double amount){
		this.amount = amount;
	}
	
	public double getAmount(){
		return amount;
	}

}
