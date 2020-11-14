package Chapter_4;
import java.util.Scanner;
public class EX4_4 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the sides: ");
		double sides=input.nextDouble();
		double calculaiton=(6 * Math.pow(sides, 2))/(4 * Math.tan(Math.PI/6));
		System.out.print("The area of the hexagon is: "+(int)(calculaiton *100)/100.0);
	}
}
