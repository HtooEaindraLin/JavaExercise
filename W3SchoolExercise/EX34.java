package W3SchoolExercise;
import java.util.Scanner;
public class EX34 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Input the length of the side of a hexagon: ");
		double side=input.nextInt();
		double area=(6*Math.pow(side, 2))/(4*Math.tan(Math.PI/6));
		System.out.print("The area of the hexagon is: "+area);
	}

}
