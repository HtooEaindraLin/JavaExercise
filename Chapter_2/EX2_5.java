package Chapter_2;
import java.util.Scanner;
public class EX2_5 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the subtotal and gratuity rate: ");
		double subtotal=input.nextDouble();
		double gratuity_rate=input.nextDouble();
		double gratuity=gratuity_rate/subtotal;
		double total=subtotal+gratuity;
		System.out.print("The gratuity is $"+gratuity+" and total is $"+total);
	}
}
