package Chapter_4;
import java.util.Scanner;
public class EX4_1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the length from from the center to a vertex: ");
		double r=input.nextDouble();
		double side=2 * r *Math.sin(Math.PI/5);
		double area=( 5 * Math.pow(side, 2))/(4*Math.tan(Math.PI/5));
		System.out.println("The area of pentagon is : "+(int)(area*100)/100.0);
	}
}
