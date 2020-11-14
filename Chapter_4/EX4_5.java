package Chapter_4;
import java.util.Scanner;
public class EX4_5 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of sides: ");
		double n=input.nextDouble();
		System.out.print("Enter the sides: ");
		double s=input.nextDouble();
		double area=( n* Math.pow(s,2))/(4*Math.tan(Math.PI/n));
		System.out.print("The area of the polygon is: "+area);
	}
}
