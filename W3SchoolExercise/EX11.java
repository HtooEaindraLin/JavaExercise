package W3SchoolExercise;

import java.util.Scanner;
public class EX11 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.print("Enter Radius :");
		double radius=input.nextDouble();
		double area=Math.PI* Math.pow(radius, 2);
		double perimeter=2*Math.PI* radius;
		System.out.println("Perimeter is= "+perimeter);
		System.out.println("Area is ="+ area);
	}

}
