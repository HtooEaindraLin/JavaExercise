package Chapter_2;
import java.util.Scanner;
public class EX2_21 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter investment amount: ");
		double invest_amount=input.nextDouble();
		System.out.print("Enter annual interest rate in percentage: ");
		double annual_interest=input.nextDouble();
		System.out.print("Enter number of years: ");
		int years=input.nextInt();
		double monthly_interest=annual_interest/1200;
		double future_investment=invest_amount * Math.pow(1+ monthly_interest,(years*12));
		System.out.print("Accumulated Value: $"+Math.round(future_investment*100)/100.0);
	}
}
