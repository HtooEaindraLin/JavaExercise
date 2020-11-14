package W3SchoolExercise;

import java.util.Scanner;

public class EX22 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Input a binary number: ");
		int binary=input.nextInt();
		int count=0;
		int sum=0;
		while(binary>0) {
			sum+=(binary%10)*Math.pow(2,count);
			binary=binary/10;
			count++;			
		}
		System.out.print("Decimal Number:"+sum);
	}

}
