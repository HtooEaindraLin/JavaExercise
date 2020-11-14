package Chapter_2;
import java.util.Scanner;
public class EX2_13 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the monthly saving amount: ");
		double saving_amount=input.nextDouble();
		double first_month=saving_amount *(1+0.00417);
		double sum=first_month;
		for(int i=1;i<=5;i++) {
			sum=(100+sum)*(1+0.00417);
		}
		System.out.print("After the six month, the account value is: $"+Math.round(sum*100)/100.0);
	}
}
