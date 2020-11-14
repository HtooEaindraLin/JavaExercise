package Chapter_4;

import java.util.Scanner;

public class EX4_23 {
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.print("Enter employees' name: ");
		String employee_name=input.next();
		System.out.print("Enter number of hours worked in a week: ");
		int hour=input.nextInt();
		System.out.print("Enter hourly pay rate: ");
		int pay_rate=input.nextInt();
		System.out.print("Enter federal tax withholding rate: ");
		int federal_tax=input.nextInt();
		System.out.print("Enter state tax withholding rate: ");
		int state_tax=input.nextInt();
		System.out.println("Employee Name: "+employee_name);
		System.out.println("Hour Worked :"+hour);
		System.out.println("Pay rate:$ "+pay_rate);
		System.out.println("Gross Pay:$"+pay_rate*10);
		System.out.println("Deductions");
		System.out.println("Federal Withholding (20%)"+pay_rate * federal_tax);
		//System.out.println("State Withholding (9.0%)"+);
	}

}
