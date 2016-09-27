import java.util.Scanner;

public class Q1 {
	
	public static void main(String[] args) {
	
		System.out.println("Enter your intial tuition amount:");
		Scanner tuition = new Scanner(System.in);
		float Tuition = tuition.nextFloat();
		
		System.out.println("Enter the percent increase:");
		Scanner percentage = new Scanner(System.in);
		float Percentage = (percentage.nextFloat()/100);
		
		float Debt = Tuition;
		
		for(int year=1; year<4; year++){
			float AddDebt = Tuition * (1+Percentage);
			Debt = Debt + AddDebt;
			Tuition = AddDebt;
		}
		System.out.println(String.format("The cost to complete your four degree is: %.2f",Debt));
	}
}