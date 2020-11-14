package Chapter_3;
import java.util.Scanner;
public class EX3_15 {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("Enter guees number: ");
	int guess=input.nextInt();
	int guess1=guess/10;
	int guess2=guess%10;
	int lottery=(int) (Math.random()*100);
	int lottery1=lottery/10;
	int lottery2=lottery%10;
	System.out.println("The lottery number is: "+lottery);
	if(guess==lottery) {
		System.out.print("Exact match: you win $10,000.");
	}else if(guess1==lottery1 && guess2==lottery2) {
		System.out.print("Match all digitis : you win $3000");
	}else if(guess1==lottery1 || guess1==lottery2 ||guess2==lottery1|| guess2==lottery2) {
		System.out.print("Match one digit: you win $ 1000");
	}else System.out.print("Sorry, no match");
	
	}

}
