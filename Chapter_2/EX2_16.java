package Chapter_2;
import java.util.Scanner;
public class EX2_16 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the sides: ");
		double side=input.nextDouble();
		double calculation= (3 * Math.sqrt(3)* Math.pow(side, 2))/2;
		System.out.print("The area of the hexagon is: "+Math.round(calculation*10000)/10000.0);
	}
}
