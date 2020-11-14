package Chapter_2;
import java.util.Scanner;
public class EX2_23 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the driving distance: ");
		double distance=input.nextDouble();
		System.out.print("Enter miles per gallon: ");
		double miles_gallon=input.nextDouble();
		System.out.print("Enter prices per gallon: ");
		double prices_gallon=input.nextDouble();
		double calculation=(distance * prices_gallon)/miles_gallon;
		System.out.print("The cost of driving is: $"+Math.round(calculation *100)/100.0);
	}
}
