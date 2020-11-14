package W3SchoolExercise;

import java.util.Scanner;

public class EX108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=input.nextInt();
		int sum=(num/10)+(num%10);
		System.out.print("The sum of the single digit is: "+sum);
	}

}
