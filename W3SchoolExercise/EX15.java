package W3SchoolExercise;

import java.util.Scanner;

public class EX15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int num1=input.nextInt();
		System.out.print("Enter number 2: ");
		int num2=input.nextInt();
		System.out.println("Before swapping: "+num1+" "+num2);
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After swapping: "+num1+" "+num2);
	}

}
