package Chapter_3;
import java.util.Scanner;
public class EX3_7 {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("Enter amount in double : eg: 11.56 $: ");
	double amount=input.nextDouble();
	int remaininAmount=(int) (amount *100);
	int numberofDollars=remaininAmount/100;
	remaininAmount=remaininAmount%100;
	int numberofQuarters=remaininAmount/25;
	remaininAmount=remaininAmount%25;
	int numberofDimes=remaininAmount/10;
	remaininAmount=remaininAmount%10;
	int numberofNickles=remaininAmount/5;
	remaininAmount=remaininAmount%5;
	int numberofPennies=remaininAmount;
	System.out.println("Your amount is: "+amount+" consists of");
	System.out.println(" "+numberofDollars+" dollars.");
	System.out.println(" "+numberofQuarters+" quarters");
	System.out.println(" "+numberofDimes+" dimes");
	System.out.println(" "+numberofNickles+" nickles.");
	System.out.println(" "+numberofPennies+" pennies");	
	}
}
