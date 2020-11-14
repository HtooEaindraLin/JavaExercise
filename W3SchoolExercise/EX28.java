package W3SchoolExercise;

import java.util.Scanner;
public class EX28 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Input a hexadecimal number: ");
		int hex=input.nextInt();
		int sum=0;
		int count=0;
		while(hex>0) {
			sum+=(hex%10)*Math.pow(16, count);
			hex=hex/10;
			count++;
		}
		System.out.print("Equivalent decimal number is: "+sum);

	}

}
