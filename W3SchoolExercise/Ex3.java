package W3SchoolExercise;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.print("Enter Division: ");
		int division=input.nextInt();
		System.out.print("Enter Divisor: ");
		int divisor=input.nextInt();
		int result=division/divisor;
		System.out.print("The result is :"+result);

	}

}
