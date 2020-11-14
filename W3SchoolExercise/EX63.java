package W3SchoolExercise;

import java.util.Scanner;

public class EX63 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub(System.in);
		Scanner input=new Scanner(System.in);
		System.out.print("Input the first number: ");
		int first=input.nextInt();
		System.out.print("Input the second number: ");
		int second=input.nextInt();
		System.out.print("Input the third number: ");
		int third=input.nextInt();
		System.out.println(Math.abs(first-second)>=20 || Math.abs(second-third)>=20 || Math.abs(third-first)>=20);

	}

}
