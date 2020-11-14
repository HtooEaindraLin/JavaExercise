package Chapter_2;
import java.util.Scanner;
public class EX2_22 {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("Enter an amount in double, for example 11.56: ");
	double amount=input.nextDouble();
	int remaining_amount=(int) (amount *100);
	int numberOfOneDollars=remaining_amount/100;
	remaining_amount=remaining_amount % 100;
	int numberOfQuarters=remaining_amount/25;
	remaining_amount=remaining_amount % 25;
	int numberOfDimes=remaining_amount/10;
	remaining_amount=remaining_amount % 10;
	int numberofNickles=remaining_amount/5;
	remaining_amount=remaining_amount%5;
	int numberOfPennies=remaining_amount;
	System.out.println("Your amount "+amount+" consist of ");
	System.out.println(" "+numberOfOneDollars+ " dollars");
	System.out.println(" "+numberOfQuarters+" quarters");
	System.out.println(" "+numberOfDimes+" dimes");
	System.out.println(" "+numberofNickles+" nickles");
	System.out.println(" "+numberOfPennies+" pennies");			
	}
}
