package W3SchoolExercise;

import java.util.Scanner;

public class EX25 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Input any octal number: ");
		int oct=input.nextInt();
		int count=0;
		int sum=0;
		while(oct>0) {
			sum+=(oct%10)*Math.pow(8,count);
			count++;
			oct=oct/10;
		}
		System.out.print("Equivalent decimal number is: "+sum);
	}
}
