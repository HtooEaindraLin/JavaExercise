package Chapter_3;
import java.util.Scanner;
public class EX3_33 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter weight and price for package 1: ");
		double weight1=input.nextDouble();
		double price1=input.nextDouble();
		System.out.print("Enter weight and price for package 2: ");
		double weight2=input.nextDouble();
		double price2=input.nextDouble();
		if(weight1/price1== weight2/price2) {
			System.out.print("Two packages has same price.");
		}else if(weight1/price1 < weight2/price2) {
			System.out.println("Package 2 has better price.");
		}else System.out.println("Package 1 has better price.");
	}
}
