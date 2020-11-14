package Chapter_2;
import java.util.Scanner;
public class EX2_4 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number in pounds: ");
		double pounds=input.nextDouble();
		double pounds_kilo=0.454;
		System.out.println(pounds+" pounds is "+pounds*pounds_kilo+" kilograms.");
	}
}
