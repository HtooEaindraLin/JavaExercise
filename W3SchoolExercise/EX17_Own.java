package W3SchoolExercise;

import java.util.Scanner;
public class EX17_Own {
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.print("Input first number: ");
		int num1=input.nextInt();
		System.out.print("Input second number: ");
		int num2=input.nextInt();
		int sum=(num1%10)+(num2%10);
		int remainder=(num1/10)+(num2/10);
		if(sum==2) {
			sum=10;
		}
		if(remainder==2) {
			System.out.println("10"+sum);
		}else System.out.println(sum+""+remainder);
	}	
}
