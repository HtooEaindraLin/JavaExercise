package Chapter_3;
import java.util.Scanner;
public class EX3_31 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the exchange rate from dollars to RMB: ");
		double exchangeRate=input.nextDouble();
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		int options=input.nextInt();		
		switch(options) {
		case 0:{
			System.out.print("Enter dollar amount ($): ");
			double dollar_amt=input.nextDouble();
			System.out.print("$ "+dollar_amt+" is "+exchangeRate+" yuan.");break;
				}
		case 1: {
			System.out.print("Enter the RMB amount: ");
			double RMB_amt=input.nextDouble();
			System.out.print(RMB_amt+ " yuan is $ "+((int)(RMB_amt*100)*exchangeRate)/100.0);break;
		}
		default:System.out.print("Incorrect Input");
		}
	}
}
