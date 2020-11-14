package W3SchoolExercise;
import java.util.Scanner;
public class EX35 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Input the number of sides on the polygon: ");
		double n=input.nextDouble();
		System.out.print("Input the length one of the sides: ");
		double s=input.nextDouble();
		double area=(n*Math.pow(s,2))/(4*Math.tan(Math.PI/n));
		System.out.print("The area is: "+area);
	}
}
