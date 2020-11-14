package Chapter_2;
import java.util.Scanner;
public class EX2_20 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter balance and interest rate: ");
		double balance=input.nextDouble();
		double interest_rate=input.nextDouble();
		double interest=balance *(interest_rate/1200);
		System.out.println("The interest is: "+Math.round(interest *100000)/100000.0);
	}

}
